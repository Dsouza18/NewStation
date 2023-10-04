package Produto;

import Categoria.Categoria;
import Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "produto")
@Getter
@Setter
public class Produto {
    @Id
    private Long id;
    @Column(name = "descricao_produto")
    private String descricaoProduto;
    @Column(name = "unidade_medida")
    private String unidadeMedida;
    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;
    @Column(name = "quantidade")
    private Integer quantidade;
    @OneToOne
    private Categoria categoria;
    @OneToOne
    private Usuario usuario;
    @Column(name = "data_hora_criacao")
    private LocalDateTime dataHoraDeCriacao;
    @Column(name = "codigo_barras")
    private Long codigoDeBarra;

    public Produto() {

    }

    public Produto(Long id, String descricaoProduto, String unidadeMedida, BigDecimal precoUnitario, Integer quantidade, Categoria categoria, Usuario usuario, LocalDateTime dataHoraDeCriacao, Long codigoDeBarra) {
        this.id = id;
        this.descricaoProduto = descricaoProduto;
        this.unidadeMedida = unidadeMedida;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.usuario = usuario;
        this.dataHoraDeCriacao = dataHoraDeCriacao;
        this.codigoDeBarra = codigoDeBarra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", quantidade=" + quantidade +
                ", categoria=" + categoria +
                ", usuario=" + usuario +
                ", dataHoraDeCriacao=" + dataHoraDeCriacao +
                ", codigoDeBarra=" + codigoDeBarra +
                '}';
    }

}
