<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<h2>Register here</h2>
  <form action="register" method="post">
    <table>
      <tr>
        <td>Enter Name:</td>
        <td><input type="text" name="name"/></td>
      </tr>
      <tr>
        <td>Enter Password:</td>
        <td><input type="password" name="password" />
      </tr>
      <tr>
        <td>Confirm Password:</td>
        <td><input type="password" name="password2" />
      </tr>
      <tr>
        <td><input type="radio" name="gender" checked="checked"/>Male</td>
        <td><input type="radio" name="gender"/>Female</td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit"></td>
      </tr>
    </table>
  </form>
</body>
</html>