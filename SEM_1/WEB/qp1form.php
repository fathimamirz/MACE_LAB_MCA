<html>
<head>
    <title>Supermarket</title>
</head>
<style>
    .bd{
        text-align: center;
    }
</style>
<body>
    <div class="bd">
    <h3>Product entry</h3>
    <form action="insertprod.php" method="get">
    <table>
        <tr>
            <td>PRODUCT ID:</td><td><input type="number" name="id"></td>
        </tr>
        <tr>
            <td>PRODUCT NAME:</td><td><input type="text" name="nm"></td>
        </tr>
        <tr>
            <td>UNIT PRICE:</td><td><input type="number" name="un"></td>
        </tr>
        <tr>
            <td>QUANTITY:</td><td><input type="number" name="qt"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="SUBMIT"></td>
        </tr>
    </table>
</body>
</html>