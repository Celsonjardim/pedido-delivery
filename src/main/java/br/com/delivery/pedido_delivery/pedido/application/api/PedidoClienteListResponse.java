package br.com.delivery.pedido_delivery.pedido.application.api;

import br.com.delivery.pedido_delivery.pedido.domain.ItemPedido;
import br.com.delivery.pedido_delivery.pedido.domain.Pedido;
import br.com.delivery.pedido_delivery.pedido.domain.StatusPedido;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class PedidoClienteListResponse {
    private UUID idPedido;
    private UUID idClientePedido;
    private String valorDoPedido;
    private StatusPedido statusDoPeido;
    private List<ItemPedido> itensDoPedido;
    private LocalDateTime dataDoPedido;

    public static List<PedidoClienteListResponse> converte(List<Pedido> pedidoDoCliente) {
        return pedidoDoCliente.stream()
                .map(PedidoClienteListResponse::new)
                .collect(Collectors.toList());
    }

    public PedidoClienteListResponse(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.idClientePedido = pedido.getIdClientePedido();
        this.valorDoPedido = pedido.getValorDoPedido();
        this.statusDoPeido = pedido.getStatusDoPeido();
        this.itensDoPedido = pedido.getItensDoPedido();
        this.dataDoPedido = pedido.getDataDoPedido();
    }
}
