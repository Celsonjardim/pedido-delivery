package br.com.delivery.pedido_delivery.pedido.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class PedidoResponse {
    private UUID idPedido;
}
