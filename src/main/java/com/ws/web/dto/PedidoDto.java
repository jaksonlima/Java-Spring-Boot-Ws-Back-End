package com.ws.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class PedidoDto implements Serializable {

    private Integer id;

    private String razaoSocial;

    private String cnpj;

    private String telefone;

    private String email;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date dhCriacao;

    private List<PedidoItemDto> pedidoItens;
}
