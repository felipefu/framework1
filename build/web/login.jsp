<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crawler Login</title>
    </head>
    <body>
        <form method="GET" action="LoginServlet">
            <table>
                <tr>
                    <td>Usuário</td>
                    <td><input type="text" name="login" /></td>
                </tr>
                <tr>
                    <td>Senha</td>
                    <td><input type="password" name="senha" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
