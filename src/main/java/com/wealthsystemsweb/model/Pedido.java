package com.wealthsystemsweb.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "WS_PEDIDO")
public class Pedido {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "DH_CRIACAO")
    private LocalDateTime dhCriacao;

    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "TELEFONE")
    private String telefone;

    @NotEmpty(message = "E-mail é obrigatório")
    @Column(name = "EMAIL")
    private String email;

}
