<%-- 
    Document   : page2
    Created on : May 28, 2025, 4:07:36 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is page 2!</h1>
        
        <%
            response.sendRedirect("page3.jsp");
        %>
    </body>
</html>
