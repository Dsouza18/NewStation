package Cliente;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente {
    @Id
    private Long id;
    @Column (name = "nome_cliente")
    private String nome;
    @Column (name = "cpf_cliente")
    private Integer cpf;
    @Column (name = "endereco_cliente")
    private String endereco;
    @Column (name = "telefone_cliente")
    private String telefone;


    public Cliente(String nome, Integer cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
