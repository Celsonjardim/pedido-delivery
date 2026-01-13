package br.com.delivery.pedido_delivery.cliente.application.service;

import br.com.delivery.pedido_delivery.cliente.application.api.ClienteDetalhadoResponse;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteListResponse;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteRequest;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
