$(document).ready(function () {
    $("#name").blur(function () {
        $.ajax({
            method: "POST",
            url: "is-exist",
            data: {
                name: $("#name").val(),
            },
            success: function (dt) {
                console.log(dt);
                var dat = jQuery.parseJSON(JSON.stringify(dt));
                if (dat.data) {
                    $("#check-exist").text("Cụm đã tồn tại!");
                    $("#check-exist").css('color', 'red');
                } else {
                    $("#check-exist").text("ok");
                    $("#check-exist").css('color', 'blue');
                }
            }, dataType: "json"
        });
    });
    $('#name').on('input', function (e) {
        $("#check-exist").text("typing...");
    });
    $("#submit").click(function () {

        $.ajax({
            method: "POST",
            url: "is-exist",
            data: {
                name: $("#name").val(),
            },
            success: function (dt) {
                console.log(dt);
                var dat = jQuery.parseJSON(JSON.stringify(dt));
                if (dat.data) {
                    $("#result").text("Cụm đã tồn tại!");
                    $("#result").css('color', 'red');
                } else {
                    createPhrase();
                }
            }, dataType: "json"
        });
    });
});

function createPhrase() {
    $.ajax({
        method: "POST",
        url: "create",
        data: {
            name: $("#name").val(),
            enMeaning: $("#enMeaning").val(),
            viMeaning: $("#viMeaning").val(),
            enExample: $("#enExample").val(),
            viExample: $("#viExample").val()
        },
        success: function (dt) {
            $("#name").val("");
            $("#enMeaning").val("");
            $("#viMeaning").val("");
            $("#enExample").val("");
            $("#viExample").val("");
            $("#check-exist").text("");
            $("#result").text("Thành công!");
            $("#result").css('color', 'blue');
        }, dataType: "json"

    });
}