
import java.io.Serializable;
import java.util.Date;

/**
 *
 * Classe de entidade que possui os atributos do aluno
 *
 */
public class Usuario {

    private String login;
    private String senha;
    private String nome;
    private String cpf;
    private String email;

    public Usuario() {
    }

    public Usuario(String matricula) {
        super();
        this.nome = matricula;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}