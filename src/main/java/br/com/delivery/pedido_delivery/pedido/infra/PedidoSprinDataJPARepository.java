package br.com.delivery.pedido_delivery.pedido.infra;

import br.com.delivery.pedido_delivery.pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoSprinDataJPARepository extends JpaRepository<Pedido, UUID> {
}
