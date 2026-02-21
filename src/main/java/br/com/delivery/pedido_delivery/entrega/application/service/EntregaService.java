package br.com.delivery.pedido_delivery.entrega.application.service;

import br.com.delivery.pedido_delivery.entrega.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface EntregaService {
    EntregaResponse criaEntrega(UUID idCliente, UUID idPedido, @Valid EntregaRequest entregaRequest);
    List<EntregasListResponse> buscaTodasEntregas(UUID idCliente, UUID idPedido);
    EntregaDetalhadoResponse buscaEntregaDoClienteComID(UUID idCliente, UUID idPedido, UUID idEntrega);
    void deletaEntregaDoClienteComID(UUID idCliente, UUID idPedido, UUID idEntrega);
    void alteraEntregaDoClienteComID(UUID idCliente, UUID idPedido, UUID idEntrega, EntregaAlteracaoRequest entregaAlteracaoRequest);
}
