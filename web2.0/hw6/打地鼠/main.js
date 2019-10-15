function start_js() {
    game_state = 0;
    a = [];
    nowselection = 0;
    for (var i = 1; i <= 60; i++){
        a[i] = document.getElementById("hole_" + i);
        a[i].addEventListener('click', game_click);
    }
    function next_selection() {
        nowselection = Math.floor(Math.random() * 60 + 1);
        a[nowselection].checked = true;
    }
    function game_click() {
        console.log(event.target.id,"hole_"+nowselection);
        if (game_state == 1 && event.target.id==("hole_"+nowselection)) {
            document.getElementById("score").innerHTML = 1-("-"+document.getElementById("score").innerHTML);
            a[nowselection].checked = false;
            next_selection();
        }
        else {
            event.target.checked = false;
        }
    }
    function stop_game() {
        for (var i = 1; i <= 60; i++){
            a[i].checked = false;
            a[i].disabled = true;
        }
    }
    function start_game() {
        for (var i = 1; i <= 60; i++){
            a[i].checked = false;
            a[i].disabled =false;
        }
    }
    function next() {
        if (game_state == 1) {
            el=document.getElementById("time")
            if (el.innerHTML > 0) {
                el.innerHTML = el.innerHTML - 1;
                setTimeout(next,1000);
            }
            else {
                stop_game();
                game_state = 0;
            }
        }
    }
    function start_stop() {
        if (game_state == 0) {
            start_game();
            next_selection();
            document.getElementById("time").innerHTML = "30";
            document.getElementById("score").innerHTML = "0";
            game_state = 1;
            setTimeout(next,1000);
        }
        else {
            game_state = 0;
            stop_game();
        }
    }
    st = document.getElementById("start");
    st.addEventListener("click", start_stop);
}
window.onload = start_js;