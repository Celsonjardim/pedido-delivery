package br.com.delivery.pedido_delivery.cliente.application.service;

import br.com.delivery.pedido_delivery.cliente.application.api.ClienteRequest;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteResponse;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
