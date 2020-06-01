package com.ws.web.service;

import com.ws.web.model.Pedido;
import com.ws.web.repository.PedidoRepository;
import com.ws.web.service.impl.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class PedidoServiceImpl implements IPedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido criar(Pedido pedido) {
        if (pedido == null || pedido == null || pedido.getPedidoItens().isEmpty()) {
            throw new RuntimeException("Pedido não pode ser vazio.");
        }
        pedido.setDhCriacao(new Date());

        pedido.getPedidoItens().stream().forEach(pedidoItem -> {
            pedidoItem.setLocalDateTime(LocalDateTime.now());
            pedidoItem.setPedido(pedido);
        });

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
