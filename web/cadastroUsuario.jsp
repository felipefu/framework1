<jsp:useBean id="person" class="beans.PersonBean" scope="page"/>
<jsp:setProperty name="person" property="*"/>

<html>
    <body>
        <form action="main.jsp" method="GET">
            Nome: <input type="text" name="nome"><br />
            CPF: <input type="text" name="cpf"><br />
            Email: <input type="text" name="email"><br />
            Login: <input type="text" name="login"><br />
            Senha: <input type="text" name="senha"><br />
            Confirme sua senha: <input type="text" name="senhaConfirma"><br />
            <input type="submit" value="Cadastrar" />
        </form>
    </body>
</html>
