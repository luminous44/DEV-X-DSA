


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/mylib.tld" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>custom tag Page</title>
    </head>
    <body>
      
        <t:mytag number="20" color="red"></t:mytag>
        <hr><!-- comment -->  
        <t:mytag number="10" color="green"></t:mytag>
        
    </body>
</html>
