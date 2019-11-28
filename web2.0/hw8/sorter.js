$(function () {
    $ths = $("th");
    $ths.append('<span class="triangle"></span>');
    $ths.addClass("desend");
    _.forEach($ths, function (th) {
        $(th).click(sortTable());
    })
});


function sortTable() {
    var dir = -1;
    return function () {
        $this = $(this);
        var $table = $this.parents("table");
        var col = $table.children("thead").children("tr").children("th").index($this);
        dir = dir * -1;
        console.log($this, dir);
        processSort($table, col, dir);
        styleChange($table, col, dir);
    }
}

function processSort($table, col, dir) {
    $trs = $table.find("tbody").find("tr");
    $trs.sort(function (a, b) {
        var t1 = $(a).children('td').eq(col).html();
        var t2 = $(b).children('td').eq(col).html();
        return dir * ((t1 > t2) * 2 - 1);
    });
    $table.children('tbody').children('tr').remove();
    $trs.appendTo($table.children('tbody'));
}

function styleChange($table, col, dir) {
    $trs = $table.find("tbody").find("tr");
    $trs.removeClass("alternate").filter(":odd").addClass("alternate");
    $table.find(".active").removeClass("active")  // 表头的颜色改变
        .find(".triangle").removeClass("ascend descend");　　//　三角改变
    $table.find('thead').find('th').eq(col).addClass("active")
       .find(".triangle").addClass(dir === -1 ? "ascend" : "descend");
}