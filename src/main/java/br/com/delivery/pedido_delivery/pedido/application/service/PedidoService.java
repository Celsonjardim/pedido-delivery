package br.com.delivery.pedido_delivery.pedido.application.service;

import br.com.delivery.pedido_delivery.pedido.application.api.PedidoClienteDetalhadoResponse;
import br.com.delivery.pedido_delivery.pedido.application.api.PedidoClienteListResponse;
import br.com.delivery.pedido_delivery.pedido.application.api.PedidoRequest;
import br.com.delivery.pedido_delivery.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface PedidoService {
    PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);
    List<PedidoClienteListResponse> buscaPedidosDoClienteComID(UUID idCliente);
    PedidoClienteDetalhadoResponse buscaPedidoDoClienteComID(UUID idCliente, UUID idPedido);
    void deletaPedidoDoClienteComID(UUID idCliente, UUID idPedido);
}
