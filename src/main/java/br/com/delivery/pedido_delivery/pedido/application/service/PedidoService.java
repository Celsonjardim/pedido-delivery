package br.com.delivery.pedido_delivery.pedido.application.service;

import br.com.delivery.pedido_delivery.pedido.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface PedidoService {
    PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);
    List<PedidoClienteListResponse> buscaPedidosDoClienteComID(UUID idCliente);
    PedidoClienteDetalhadoResponse buscaPedidoDoClienteComID(UUID idCliente, UUID idPedido);
    void deletaPedidoDoClienteComID(UUID idCliente, UUID idPedido);
    void alteraPedidoDoClienteComId(UUID idCliente, UUID idPedido, PedidoAlteracaoRequest pedidoAlteracaoRequest);
}
