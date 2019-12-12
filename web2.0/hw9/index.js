var http = require('http');
var urlTool = require('url');
var querystring = require('querystring');
var jade = require('jade');
var fs = require('fs');
var users = {};
http.createServer(function (req, res) {
    console.log(req.url);
    if (req.url == '/style.css') {
        sendFile(res, 'style.css', 'text/css');
    }
    else {
        req.method === 'POST' ? regUser(req, res) : sendHtml(req, res);
    }
}).listen(7777);

function sendFile(res, filePath, mime) {
    res.writeHead(200, { 'Content-Type': mime });
    res.end(fs.readFileSync(filePath));
}
console.log("Signup server is listening on 7777");
function sendHtml(req,res) {
    var username = parseUsername(req);
    if (!username || !isRegisterUser(username)) {
        resSignup(res);
    }
    else {
        resInfo(res,users[username]);
    }
}

function parseUsername(req) {
    return querystring.parse(urlTool.parse(req.url).query).username;
}
function isRegisterUser(username) {
    return !!users[username];
}

function resSignup(res) {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end(jade.renderFile('signup.jade'));
}

function resInfo(res,user) {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.end(jade.renderFile('info.jade',user));
}

function regUser(req,res) {
    req.on('data', function (chunk) {
        var user = parseUser(chunk.toString());
        users[user.username] = user;
        res.writeHead(301, { Location: '?username=' + user.username });
        res.end();
    });

}

function parseUser(message) {
    console.log(message);
    params = message.match(/username=(.+)&sid=(.+)&phone=(.+)&email=(.+)/);
    var user = { username: params[1], sid: params[2], phone: params[3], email: params[4] };
    console.log('user parse is:', user);
    return user;
}