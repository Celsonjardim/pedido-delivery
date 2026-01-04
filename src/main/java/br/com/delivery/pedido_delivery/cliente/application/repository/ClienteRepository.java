package br.com.delivery.pedido_delivery.cliente.application.repository;

import br.com.delivery.pedido_delivery.cliente.domain.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
    List<Cliente> buscaTodosClientes();
}
