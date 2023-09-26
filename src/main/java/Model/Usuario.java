package Model;

import entities_Enum.Funcao;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_usuario")
    private String login;
    @Column(name = "senha_usuario")
    private String senha;
    @Column(name = "nivelAcesso")
    private Funcao funcao;


    public Usuario(String login, String senha, Funcao funcao) {
        this.login = login;
        this.senha = senha;
        this.funcao = funcao;
    }

    public Usuario() {

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

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
