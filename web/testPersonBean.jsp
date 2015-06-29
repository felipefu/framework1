<jsp:useBean id="person" class="beans.PersonBean" scope="page"/>
<jsp:setProperty name="person" property="*"/>

<html>
    <body>
        Name: <jsp:getProperty name="person" property="name" /><br/>
        Deceased? <jsp:getProperty name="person" property="deceased" /><br/>
        <br/>
        <form method="GET" action="testPersonBean.jsp">
            Informe o nome: <input type="text" name="name" size="50"> <br/>
            Escolha:
            <select name="deceased">
                <option value="false">Vivo</option>
                <option value="true">Morto</option>
            </select>
            <input type="submit" value="Testar Bean">
        </form>
    </body>
</html>