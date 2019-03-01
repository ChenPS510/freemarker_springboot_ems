<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
      <title>FreeMarkerTest</title>
</head>
<body>
<#--遍历List集合-->
<table border="1">
<#list emps as emp>
    <tr>
        <td>${emp.id}</td>
        <td>${emp.name}</td>
        <td> ${emp.age}</td>
        <td>${emp.sex}</td>
        <td>${emp.birthday?datetime}</td>
        <td> ${emp.score}</td>
        <td>${emp.salary}</td>
    </tr>
</#list>
</table>
</body>
</html>