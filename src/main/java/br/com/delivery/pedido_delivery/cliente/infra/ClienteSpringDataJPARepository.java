package br.com.delivery.pedido_delivery.cliente.infra;

import br.com.delivery.pedido_delivery.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
    Optional<Cliente> findByIdCliente(UUID idCliente);
}
