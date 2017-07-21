$(document).ready(function () {
    var ctx = "${pageContext.request.contextPath}";
    $("#submit").click(function () {
        $.ajax({
            method: "POST",
            url: "create",
            data: {name: "hello"}

        }).success(function (data) {
            alert("" + data)
        });
    });
});