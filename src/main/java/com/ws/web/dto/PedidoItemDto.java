package com.ws.web.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PedidoItemDto implements Serializable {

    private Integer id;

    private String nome;

    private String quantidade;

    private String preco;

    private Integer total;

    private Boolean statusPedido;

}
