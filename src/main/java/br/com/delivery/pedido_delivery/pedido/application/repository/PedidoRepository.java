package br.com.delivery.pedido_delivery.pedido.application.repository;

import br.com.delivery.pedido_delivery.pedido.domain.Pedido;

import java.util.List;
import java.util.UUID;

public interface PedidoRepository {
    Pedido salvaPedido(Pedido pedido);
    List<Pedido> buscaPedidosDoClienteComID(UUID idCliente);
    Pedido buscaPedidoPeloId(UUID idPedido);
    void deletaPedido(Pedido pedido);
}
