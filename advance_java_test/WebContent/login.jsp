<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

<h1>Welcome</h1>
<form action="login" method="post">
<input type="hidden" name="requestAction" value="login" />
<h2>Login</h2>
<table>
    <tr>
        <td>User Name:</td>
        <td><input type="text" name="login"></td>
    </tr>
    <tr>
        <td>Password:</td>
        <td><input type="password" name="password"></td>
    </tr>
    <tr>
        <td><input type="submit" name="submit" value="submit"></td>
    </tr>
</table>

 

<% if(request.getAttribute("LoginStatus")!=null){
            if(request.getAttribute("LoginStatus").equals("fail")){ %>
                
            <%="Invalid Credential" %>
            
            
        <% }
            } %>
            

 

</form>
</body>
</html>