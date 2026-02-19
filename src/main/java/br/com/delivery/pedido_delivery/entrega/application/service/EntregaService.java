package br.com.delivery.pedido_delivery.entrega.application.service;

import br.com.delivery.pedido_delivery.entrega.application.api.EntregaDetalhadoResponse;
import br.com.delivery.pedido_delivery.entrega.application.api.EntregaRequest;
import br.com.delivery.pedido_delivery.entrega.application.api.EntregaResponse;
import br.com.delivery.pedido_delivery.entrega.application.api.EntregasListResponse;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface EntregaService {
    EntregaResponse criaEntrega(UUID idCliente, UUID idPedido, @Valid EntregaRequest entregaRequest);
    List<EntregasListResponse> buscaTodasEntregas(UUID idCliente, UUID idPedido);
    EntregaDetalhadoResponse buscaEntregaDoClienteComID(UUID idCliente, UUID idPedido, UUID idEntrega);
}
