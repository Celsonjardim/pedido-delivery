package br.com.delivery.pedido_delivery.cliente.application.service;

import br.com.delivery.pedido_delivery.cliente.application.api.ClienteListResponse;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteRequest;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
}
