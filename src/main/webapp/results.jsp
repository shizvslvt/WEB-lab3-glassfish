<jsp:useBean id="results" scope="request" type="lab3.weblab3glassfish.model.Results"/>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Calculation Results</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>

<div class="container">
    <h1>Calculation Results</h1>
    <small>(start: ${results.start}, end: ${results.end}, step: ${results.step})</small>
    <br>
    <table>
        <thead><tr><th></th><th>I</th><th>X</th><th>Y</th></tr></thead>
        <tbody>
        <tr><td>Max</td><td>${results.maxI}</td><td>${results.maxX}</td><td>${results.maxY}</td></tr>
        <tr><td>Min</td><td>${results.minI}</td><td>${results.minX}</td><td>${results.minY}</td></tr>
        </tbody>
    </table>


    <h2> Sum and Average</h2>

    <table>
        <thead><tr><th>Sum</th><th>Average</th></tr></thead>
        <tbody>
        <tr><td>${results.sum}</td><td>${results.average}</td></tr>
        </tbody>
    </table>


</div>

</body>
</html>