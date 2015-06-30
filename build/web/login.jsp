<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crawler Login</title>
    </head>
    <body>
        <form method="GET" action="LoginServlet">
            Login: <input type="text" name="login"/><br>		
            Senha: <input type="text" name="senha"/>
            <input type="submit" value="submit">			
        </form>
    </body>
</html>
