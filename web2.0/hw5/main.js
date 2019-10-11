var s = "";
var open = false;
function display_expression() {
    document.getElementById("expression").value=s;
}
function clear_result() {
    document.getElementById("result").value="";
}
function on() {
    s = "";
    display_expression();
    if (!open)
        document.getElementById("result").value = "0";
    else
        clear_result();
    open = !open;
}
function equal_click() {
    document.getElementById('equal').focus();
    s=document.getElementById("expression").value;
    try {
        var t = eval(s);
        if (t == undefined) {
            clear_result();
            alert("计算式为空");
        }
        else
            document.getElementById("result").value = t;
    }
    catch{
        alert("计算式无法执行");
    }

}

document.onkeydown=function(event){
  var e = event || window.event || arguments.callee.caller.arguments[0];
    if (e && e.keyCode == 13) { 
        focus(document.getElementById("equal"));
        equal_click();
    }
    if (e && e.keyCode == 8) { 
      withdraw();
    }
}; 
function num0_click() {
    if (open){
    s = s + 0;
    display_expression();
    }
}
function num1_click() {
    if (open) {
        s = s + 1;
        display_expression();
    }
}
function num2_click() {
    if (open) {
        s = s + 2;
        display_expression();
    }
}
function num3_click() {
    if (open) {
        s = s + 3;
        display_expression();
    }
}
function num4_click() {
    if (open) {
        s = s + 4;
        display_expression();
    }
}
function num5_click() {
    if (open) {
        s = s + 5;
        display_expression();
    }
}
function num6_click() {
    if (open) {
        s = s + 6;
        display_expression();
    }
}
function num7_click() {
    if (open) {
        s = s + 7;
        display_expression();
    }
}
function num8_click() {
    if (open) {
        s = s + 8;
        display_expression();
    }
}
function num9_click() {
    if (open) {
        s = s + 9;
        display_expression();
    }
}
function num0_click() {
    if (open) {
        s = s + 0;
        display_expression();
    }
}
function plus_click() {
    if (open) {
        s = s + "+";
        display_expression();
    }
}
function multiply_click() {
    if (open) {
        s = s + "*";
        display_expression();
    }
}
function subduction_click() {
    if (open) {
        s = s + "-";
        display_expression();
    }
}
function point_click() {
    if (open) {
        s = s + ".";
        display_expression();
    }
}
function left_bracket_click() {
    if (open) {
        s = s + "(";
        display_expression();
    }
}
function right_bracket_click() {
    if (open) {
        s = s + ")";
        display_expression();
    }
}
function CE_click() {
    if (open) {
        s = "";
        document.getElementById("result").value = "0";
        display_expression();
    }
}
function division_click() {
    if (open) {
        s = s + "/";
        display_expression();
    }
}

function withdraw() {
    if (open) {
        s = s.substr(0, s.length - 1);
        display_expression();
    }
}