package Venda;

import Produto.Produto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class VendaItem {

    @Column(name = "id_venda")
    @ManyToMany
    private Venda venda;
    @Column(name = "id_produto")
    @ManyToMany
    private Produto produto;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "desconto")
    private BigDecimal desconto;
}
