var game_state = 0//未在游戏中
var progress = -1;
var cheat = 0;
var el = window.document.body;
function game_init() {
    game_state = 0//未在游戏中
    document.getElementById("game_tip").innerHTML = "...";
    s = document.getElementsByClassName("warn_wall");
    for (var i = 0; i < s.length; i++) {
        s[i].className = "wall";
    }
    cheat = 0;
}
function regame() {
    if (game_state == 2) {
        game_init();
    }
}
window.document.body.onmouseover = function(event){
    el = event.target;//鼠标每经过一个元素，就把该元素赋值给变量el
    console.log("yuansu", el);
    if (game_state == 0 ) {
        if(el.id=="S"){
            game_state = 1;
            progress = 0;
        }
        if (el.id == "E") {
            document.getElementById("game_tip").innerHTML = "Don't cheat, you should start from \"S\" and move to the \"E\" inside the maze!";
            game_state = 2;
        }
    }
    else if (game_state == 1) {
        if (el.id=="outside") {
            cheat = 1;
        }
        else if (el.className == "wall") {
            el.className = "warn_wall";
            document.getElementById("game_tip").innerHTML = "You Lose";
            game_state = 2;
        }
        if (el.id == "E") {
            if (cheat == 1) {
                document.getElementById("game_tip").innerHTML = "Don't cheat, you should start from \"S\" and move to the \"E\" inside the maze!";
                game_state = 2;
            }
            else {
                document.getElementById("game_tip").innerHTML = "You Win";
                game_state = 2;
            }
        }
    }
    else if (game_state == 2) {
        if (el.id == "outside") {
            game_init();
        }
    }

}