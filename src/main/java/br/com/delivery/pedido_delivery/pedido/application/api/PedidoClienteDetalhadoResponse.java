package br.com.delivery.pedido_delivery.pedido.application.api;

import br.com.delivery.pedido_delivery.pedido.domain.ItemPedido;
import br.com.delivery.pedido_delivery.pedido.domain.StatusPedido;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Value
public class PedidoClienteDetalhadoResponse {
    private UUID idPedido;
    private UUID idClientePedido;
    private String valorDoPedido;
    private StatusPedido statusDoPeido;
    private List<ItemPedido> itensDoPedido;
}
