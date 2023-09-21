package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double precoDeVenda;

    public Venda() {
    }

    public Venda(Integer id, Double precoDeVenda) {
        this.id = id;
        this.precoDeVenda = precoDeVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", precoDeVenda=" + precoDeVenda +
                '}';
    }
}


