package Services;

import Model.Produto;
import Model.Cliente;

import javax.persistence.Entity;

@Entity
public class VendaService {

    private Double precoDeVenda;
    private Produto produto;
    private Cliente cliente;

    public VendaService(Double precoDeVenda, Produto produto, Cliente cliente) {
        this.precoDeVenda = precoDeVenda;
        this.produto = produto;
        this.cliente = cliente;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}


