package com.ws.web.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "WS_PEDIDO")
public class Pedido {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "DH_CRIACAO")
    private Date dhCriacao;

    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "TELEFONE")
    private String telefone;

    @NotEmpty(message = "E-mail é obrigatório")
    @Column(name = "EMAIL")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pedido")
    private List<PedidoItem> pedidoItens;
}
