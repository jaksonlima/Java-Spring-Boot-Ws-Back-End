package com.ws.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ws.web.model.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Integer> {
}
