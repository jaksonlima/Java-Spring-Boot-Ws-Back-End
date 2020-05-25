package com.wealthsystemsweb.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PedidoDto {

    private String razaoSocial;

    private String cnpj;

    private String telefone;

    private String email;

    private LocalDateTime dhCriacao;
}
