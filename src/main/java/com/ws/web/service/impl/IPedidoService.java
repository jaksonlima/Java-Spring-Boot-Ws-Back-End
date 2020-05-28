package com.ws.web.service.impl;

import com.ws.web.model.Pedido;

import java.util.List;

public interface IPedidoService {

    Pedido criar(Pedido pedido);

    List<Pedido> listar();

    void remover(Integer idPedido);
}
