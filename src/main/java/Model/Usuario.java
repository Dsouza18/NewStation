package Model;

import entities_Enum.Funcao;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author daniel santos
 */

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {
    @Id
    private Long id;
    @Column(name = "nome_usuario")
    private String login;
    @Column(name = "senha_usuario")
    private String senha;
    @Column(name = "nivelAcesso")
    private Funcao funcao;
    private boolean estado;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimoLogin;

    public Usuario() {

    }
    public Usuario(Long id, String login, String senha, Funcao funcao, boolean estado, LocalDateTime dataHoraCriacao, LocalDateTime ultimoLogin) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.funcao = funcao;
        this.estado = estado;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimoLogin = ultimoLogin;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", funcao=" + funcao +
                ", estado=" + estado +
                ", dataHoraCriacao=" + dataHoraCriacao +
                ", ultimoLogin=" + ultimoLogin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void reset() {
        this.estado = true;
    }

    public void mudarEstado() {
        this.estado = !this.estado;
    }
}
