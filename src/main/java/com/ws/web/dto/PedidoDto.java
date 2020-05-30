package com.ws.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PedidoDto implements Serializable {

    private String razaoSocial;

    private String cnpj;

    private String telefone;

    private String email;

    private LocalDateTime dhCriacao;

    private List<PedidoItemDto> pedidoItems;
}
