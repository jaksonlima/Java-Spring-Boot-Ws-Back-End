package com.ws.web.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "WS_PEDIDO_ITEM")
public class PedidoItem {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "PRODUTO")
    private String produto;

    @Column(name = "QUANTIDADE")
    private BigDecimal quantidade;

    @Column(name = "PRECO")
    private BigDecimal preco;

    @Column(name = "TOTAL")
    private BigDecimal total;

    @Column(name = "DH_CRIACAO")
    private LocalDateTime localDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID")
    private Pedido pedido;

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
