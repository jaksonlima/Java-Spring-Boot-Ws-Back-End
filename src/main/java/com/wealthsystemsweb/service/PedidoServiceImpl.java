package com.wealthsystemsweb.service;

import com.wealthsystemsweb.WealthsystemswebApplication;
import com.wealthsystemsweb.model.Pedido;
import com.wealthsystemsweb.repository.PedidoRepository;
import com.wealthsystemsweb.service.impl.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoServiceImpl implements IPedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido criar(Pedido pedido) {
        pedido.setDhCriacao(LocalDateTime.now());
        return pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    @Override
    public void remover(Integer idPedido) {
        Pedido pedido = pedidoRepository
                .findById(idPedido)
                .orElseThrow();

        pedidoRepository.delete(pedido);
    }
}
