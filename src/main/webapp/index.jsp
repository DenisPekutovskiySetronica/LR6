<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Generate Table</title>
</head>
<body>
<form action="GenerateTableServlet" method="get">
    <table align="center">
        <tr>
            <td>Title:</td>
            <td><input type="text" name="title" /></td>
        </tr>
        <tr>
            <td>Rows:</td>
            <td><input type="text" name="rows" /></td>
        </tr>
        <tr>
            <td>Columns:</td>
            <td><input type="text" name="columns" /></td>
        </tr>
        <tr>
            <td>Background Color:</td>
            <td><input type="text" name="backgroundColor" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Generate Table" /></td>
        </tr>
    </table>
</form>
</body>