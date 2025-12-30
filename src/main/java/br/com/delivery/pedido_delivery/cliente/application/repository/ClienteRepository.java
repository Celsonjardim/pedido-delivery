package br.com.delivery.pedido_delivery.cliente.application.repository;

import br.com.delivery.pedido_delivery.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
