package com.ws.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PedidoItemDto implements Serializable {

    private Integer id;

    private String produto;

    private BigDecimal total;

    private BigDecimal quantidade;

    private BigDecimal preco;

}
