<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
          crossorigin="anonymous">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/create-phrase.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>

<div class="panel-group" style="width: 30%;margin: auto; position: relative;
  top: 10%;">
    <div class="panel panel-info">
        <div class="panel-heading">Create New Phrase Verb</div>
    </div>
    <div class="panel-body">
        <form role="form" data-toggle="validator">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control" id="name" required>
                <div id="check-exist"></div>
            </div>
            <div class="form-group">
                <label for="enMeaning">Meaning In English:</label>
                <input type="text" class="form-control" id="enMeaning">
            </div>
            <div class="form-group">
                <label for="viMeaning">Meaning In Vietnamese:</label>
                <input type="text" class="form-control" id="viMeaning" required>
            </div>
            <div class="form-group">
                <label for="enExample">Example In English:</label>
                <input type="text" class="form-control" id="enExample" required>
            </div>
            <div class="form-group">
                <label for="viExample">Example In Vietnamese:</label>
                <input type="text" class="form-control" id="viExample">
            </div>
        <button type="button" class="btn btn-success" id="submit">Submit</button>
        </form>
        <br/>
        <div id="result"></div>
    </div>
</div>
</body>
</html>