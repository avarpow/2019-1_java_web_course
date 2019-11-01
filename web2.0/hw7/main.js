function main() {
    ongame = 0;
    pos = new Array();
    for (var i = 0; i < 4; i++) {
        pos[i] = new Array(i);
        for (var j = 0; j < 4; j++) {
            var t = document.getElementById("btn_" + (i * 4 + j + 1));
            t.addEventListener("click", btn_click);
            pos[i][j] = t;
            t.style.top = "0px";
            t.style.left = "0px";
        }
    }
}

function btn_click() {
    console.log(event.target.id);
    var flag = 0;
    for (var i = 0; i < 4; i++) {
        for (var j = 0; j < 4; j++) {
            if (pos[i][j].id == event.target.id && flag == 0) {
                console.log("i" + " " + i + "j" + " " + j + 111);
                if (i - 1 >= 0 && pos[i - 1][j].id == "btn_" + 1) {
                    pos[i][j].style.top = parseInt(pos[i][j].style.top) - 128 + "px";
                    pos[i - 1][j].style.top = parseInt(pos[i - 1][j].style.top) + 128 + "px";
                    var k = pos[i - 1][j];
                    pos[i - 1][j] = event.target;
                    pos[i][j] = k;
                    flag = 1;
                } else if (i + 1 <= 3 && pos[i + 1][j].id == "btn_" + 1) {
                    pos[i][j].style.top = parseInt(pos[i][j].style.top) + 128 + "px";
                    pos[i + 1][j].style.top = parseInt(pos[i + 1][j].style.top) - 128 + "px";
                    var k = pos[i + 1][j];
                    pos[i + 1][j] = event.target;
                    pos[i][j] = k;
                    flag = 1;
                } else if (j - 1 >= 0 && pos[i][j - 1].id == "btn_" + 1) {
                    pos[i][j].style.left = parseInt(pos[i][j].style.left) - 128 + "px";
                    pos[i][j - 1].style.left = parseInt(pos[i][j - 1].style.left) + 128 + "px";
                    var k = pos[i][j - 1];
                    pos[i][j - 1] = event.target;
                    pos[i][j] = k;
                    flag = 1;
                } else if (j + 1 <= 3 && pos[i][j + 1].id == "btn_" + 1) {
                    pos[i][j].style.left = parseInt(pos[i][j].style.left) + 128 + "px";
                    pos[i][j + 1].style.left = parseInt(pos[i][j + 1].style.left) - 128 + "px";
                    var k = pos[i][j + 1];
                    pos[i][j + 1] = event.target;
                    pos[i][j] = k;
                    flag = 1;
                }

            }
        }
    }
    if (wincheck() && ongame) {
        setTimeout(function () { }, 500);
        alert("win");
        ongame = 0;
    }
    for (var i = 0; i < 4; i++) {
        console.log(pos[i][0].id, pos[i][1].id, pos[i][2].id, pos[i][3].id);
    }
}

function restart() {
    ongame = 1;
    for (var i = 0; i < 500; i++) {
        var t1 = Math.floor(Math.random() * 4);
        mov(t1);
    }
}
function wincheck() {
    for (var i = 0; i < 4; i++){
        for (var j = 0; j < 4; j++){
            if (pos[i][j].id != "btn_" + (i * 4 + j + 1)) {
                return false;
            }
        }
    }
    return true;
}
function mov(t1) {
    for (var i = 0; i < 4; i++) {
        for (var j = 0; j < 4; j++) {
            if (pos[i][j].id == "btn_" + 1) {
                if (t1 == 1) {
                    if (i - 1 >= 0) {
                        pos[i][j].style.top = parseInt(pos[i][j].style.top) - 128 + "px";
                        pos[i - 1][j].style.top = parseInt(pos[i - 1][j].style.top) + 128 + "px";
                        var k = pos[i - 1][j];
                        pos[i - 1][j] = pos[i][j];
                        pos[i][j] = k;
                    }
                } else if (t1 == 2) {
                    if (i + 1 <= 3) {
                        pos[i][j].style.top = parseInt(pos[i][j].style.top) + 128 + "px";
                        pos[i + 1][j].style.top = parseInt(pos[i + 1][j].style.top) - 128 + "px";
                        var k = pos[i + 1][j];
                        pos[i + 1][j] = pos[i][j];
                        pos[i][j] = k;
                    }
                } else if (t1 == 3) {
                    if (j - 1 >= 0) {
                        pos[i][j].style.left = parseInt(pos[i][j].style.left) - 128 + "px";
                        pos[i][j - 1].style.left = parseInt(pos[i][j - 1].style.left) + 128 + "px";
                        var k = pos[i][j - 1];
                        pos[i][j - 1] = pos[i][j];
                        pos[i][j] = k;
                    }
                } else if (t1 == 0) {
                    if (j + 1 <= 3) {
                        pos[i][j].style.left = parseInt(pos[i][j].style.left) + 128 + "px";
                        pos[i][j + 1].style.left = parseInt(pos[i][j + 1].style.left) - 128 + "px";
                        var k = pos[i][j + 1];
                        pos[i][j + 1] = pos[i][j];
                        pos[i][j] = k;
                    }
                }
            }
        }
    }
}
window.onload = main;