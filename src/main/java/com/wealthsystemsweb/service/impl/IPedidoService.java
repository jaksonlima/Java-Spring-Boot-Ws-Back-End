package com.wealthsystemsweb.service.impl;

import com.wealthsystemsweb.model.Pedido;

import java.util.List;

public interface IPedidoService {

    Pedido criar(Pedido pedido);

    List<Pedido> listar();

    void remover(Integer idPedido);
}
