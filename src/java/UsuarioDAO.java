
import beans.usuarioBean;
import java.sql.*;
import javax.resource.spi.ConnectionManager;

public class UsuarioDAO {

    static Connection currentCon = null;
    static ResultSet rs = null;

    public static usuarioBean login2(usuarioBean bean) {

        Statement stmt = null;
        String login = bean.getLogin();
        String senha = bean.getSenha();

        String searchQuery = "select login,"
                + "       senha,"
                + "       nome"
                + "  from usuario "
                + " where login='" + login + "'"
                + "   and senha='" + senha + "';";

        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);
        System.out.println("Query: " + searchQuery);

        /*try {
         currentCon = ConnectionManager.getConnection();
         stmt = currentCon.createStatement();
         rs = stmt.executeQuery(searchQuery);
         boolean result = rs.next();

         if (!result) {
         //login e senha informados invalidos
         bean.setUsuarioValido(false);
         }
         else if (result) {
         //                bean.setNome(rs.getString("nome"));
         //                bean.setLogin(rs.getString("login"));
         //                bean.setSenha(rs.getString("senha"));
         //                bean.setCpf(rs.getString("cpf"));
         //                bean.setEmail(rs.getString("email"));
         //                bean.setUsuarioValido(true);*/
        bean.setNome("nome");
        bean.setLogin("login");
        bean.setSenha("senha");
        bean.setCpf("cpf");
        bean.setEmail("email");
        bean.setUsuarioValido(true);

        /*}
         } catch (Exception ex) {
         System.out.println("Erro no login: " + ex);
         }
         finally {
         if (rs != null) {
         try {
         rs.close();
         } catch (Exception e) {
         }
         rs = null;
         }

         if (stmt != null) {
         try {
         stmt.close();
         } catch (Exception e) {
         }
         stmt = null;
         }

         if (currentCon != null) {
         try {
         currentCon.close();
         } catch (Exception e) {
         }
         currentCon = null;
         }
         }*/
        return bean;
    }

    public static usuarioBean login(usuarioBean bean) {
        Connection c = UsuarioDAO.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = c.prepareStatement("select login, senha, nome from usuario where login = ? and senha = ?");
            ps.setString(1, bean.getLogin());
            ps.setString(2, bean.getSenha());

            rs = ps.executeQuery();

            if (rs.next()) {

                bean.setNome(rs.getString("nome"));
                bean.setLogin(rs.getString("login"));
                bean.setSenha(rs.getString("senha"));
                bean.setCpf(rs.getString("cpf"));
                bean.setEmail(rs.getString("email"));
                bean.setUsuarioValido(true);
            }
            return bean;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {;
                }
                rs = null;
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {;
                }
                ps = null;
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {;
                }
                c = null;
            }
        }
        return null;
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nome_banco", "usuario_banco", "senha_banco");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
