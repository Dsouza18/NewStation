package Model;

import jakarta.persistence.*;

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
    private Double precoUnitario;
    @Column(name = "codigo_barras")
    private Long codigoDeBarra;

    public Produto(Long id, String descricaoProduto, String unidadeMedida, Double precoUnitario, Long codigoDeBarra) {
        this.id = id;
        this.descricaoProduto = descricaoProduto;
        this.unidadeMedida = unidadeMedida;
        this.precoUnitario = precoUnitario;
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

    public Double getPrecoUnitario() {

        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {

        this.precoUnitario = precoUnitario;
    }

    public Long getCodigoDeBarra() {

        return codigoDeBarra;
    }

    public void setCodigoDeBarra(Long codigoDeBarra) {

        this.codigoDeBarra = codigoDeBarra;
    }
}
