package Model;

import jakarta.persistence.Column;

import javax.lang.model.element.Name;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Venda {

    private Usuario usuario;
    private BigDecimal totalDaVenda;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_cliente")
    private Cliente cliente;
    @Column(name = "valor_pago")
    private BigDecimal valorPago;
    @Column(name = "desconto")
    private BigDecimal desconto;
    @Column(name = "troco")
    private BigDecimal troco;
    @Column(name = "data_hora_criacao")
    private LocalDateTime dataHoraCriacao;
    @Column(name = "ultima_atualizacao")
    private LocalDateTime ultimaAtualizacao;
    @Column(name = "emitir_nota_fiscal")
    private Boolean emitirNotaFiscal;

    public Venda() {

    }

    public Venda(Usuario usuario, BigDecimal totalDaVenda, Long id, Cliente cliente, BigDecimal valorPago, BigDecimal desconto, BigDecimal troco, LocalDateTime dataHoraCriacao, LocalDateTime ultimaAtualizacao, Boolean emitirNotaFiscal) {
        this.usuario = usuario;
        this.totalDaVenda = totalDaVenda;
        this.id = id;
        this.cliente = cliente;
        this.valorPago = valorPago;
        this.desconto = desconto;
        this.troco = troco;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.emitirNotaFiscal = emitirNotaFiscal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getTotalDaVenda() {
        return totalDaVenda;
    }

    public void setTotalDaVenda(BigDecimal totalDaVenda) {
        this.totalDaVenda = totalDaVenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Boolean getEmitirNotaFiscal() {
        return emitirNotaFiscal;
    }

    public void setEmitirNotaFiscal(Boolean emitirNotaFiscal) {
        this.emitirNotaFiscal = emitirNotaFiscal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(id, venda.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "usuario=" + usuario +
                ", totalDaVenda=" + totalDaVenda +
                ", id=" + id +
                ", cliente=" + cliente +
                ", valorPago=" + valorPago +
                ", desconto=" + desconto +
                ", troco=" + troco +
                ", dataHoraCriacao=" + dataHoraCriacao +
                ", ultimaAtualizacao=" + ultimaAtualizacao +
                ", emitirNotaFiscal=" + emitirNotaFiscal +
                '}';
    }
}
