package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class VendaItem {

    @Column(name = "id_venda")
    private Venda venda;
    @Column(name = "id_produto")
    private Produto produto;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "desconto")
    private BigDecimal desconto;
}
