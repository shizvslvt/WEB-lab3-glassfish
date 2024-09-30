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
    <small>(start: ${start}, end: ${end}, step: ${step})</small>
    <br>
    <table>
        <thead><tr><th></th><th>I</th><th>X</th><th>Y</th></tr></thead>
        <tbody>
        <tr><td>Max</td><td>${maxI}</td><td>${maxX}</td><td>${maxY}</td></tr>
        <tr><td>Min</td><td>${minI}</td><td>${minX}</td><td>${minY}</td></tr>
        </tbody>
    </table>

    <h2> Sum and Average</h2>

    <table>
        <thead><tr><th>Sum</th><th>Average</th></tr></thead>
        <tbody>
        <tr><td>${sum}</td><td>${average}</td></tr>
        </tbody>
    </table>


</div>

</body>
</html>