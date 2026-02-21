package br.com.delivery.pedido_delivery.entrega.infra;

import br.com.delivery.pedido_delivery.entrega.domain.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EntregaSpringDataJPARepository extends JpaRepository<Entrega, UUID> {
    List<Entrega> findByIdPedidoEntrega(UUID idPedidoEntrega);
}
