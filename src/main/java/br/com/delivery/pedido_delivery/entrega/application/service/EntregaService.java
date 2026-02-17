package br.com.delivery.pedido_delivery.entrega.application.service;

import br.com.delivery.pedido_delivery.entrega.application.api.EntregaRequest;
import br.com.delivery.pedido_delivery.entrega.application.api.EntregaResponse;
import jakarta.validation.Valid;

import java.util.UUID;

public interface EntregaService {
    EntregaResponse criaEntrega(UUID idCliente, UUID idPedido, @Valid EntregaRequest entregaRequest);
}
