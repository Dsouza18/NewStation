package Model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descricao_produto")
    private String descricaoProduto;
    @Column(name = "unidade_medida")
    private String unidadeMedida;
    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "id_categoria")
    private Categoria categoria;
    @Column(name = "id_Usuario")
    private Usuario usuario;
    @Column(name = "data_hora_criacao")
    private LocalDateTime dataHoraDeCriacao;
    @Column(name = "codigo_barras")
    private Long codigoDeBarra;

    public Produto(){

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataHoraDeCriacao() {
        return dataHoraDeCriacao;
    }

    public void setDataHoraDeCriacao(LocalDateTime dataHoraDeCriacao) {
        this.dataHoraDeCriacao = dataHoraDeCriacao;
    }

    public Long getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(Long codigoDeBarra) {
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
