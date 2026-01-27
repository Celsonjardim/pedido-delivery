package br.com.delivery.pedido_delivery.pedido.application.service;

import br.com.delivery.pedido_delivery.pedido.domain.Pedido;

public interface PedidoRepository {
    Pedido salvaPedido(Pedido pedido);
}
