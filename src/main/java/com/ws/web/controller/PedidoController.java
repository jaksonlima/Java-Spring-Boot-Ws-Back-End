package com.ws.web.controller;

import com.ws.web.dto.PedidoDto;
import com.ws.web.dto.converter.Converter;
import com.ws.web.model.Pedido;
import com.ws.web.service.impl.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = PedidoController.PATH, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class PedidoController {

    static final String PATH = "/pedido";

    @Autowired
    private IPedidoService iPedidoService;

    @GetMapping
    public ResponseEntity listar(){
        List<Pedido> pedidos = iPedidoService.listar();

        List<PedidoDto> pedidoDtos = Converter.converterList(pedidos, PedidoDto.class);

        return ResponseEntity.ok(pedidoDtos);
    }

    @PutMapping
    public ResponseEntity criar(@RequestBody PedidoDto pedidoDto) {
        Pedido pedido = Converter.converterObject(pedidoDto, Pedido.class);

        pedido = iPedidoService.criar(pedido);

        return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }

    @DeleteMapping(path = "/{idPedido}")
    public ResponseEntity deletar(@PathVariable("idPedido") Integer idPedido) {
        iPedidoService.remover(idPedido);

        return ResponseEntity.ok().build();
    }
}
