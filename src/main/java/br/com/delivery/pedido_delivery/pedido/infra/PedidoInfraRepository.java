package br.com.delivery.pedido_delivery.pedido.infra;

import br.com.delivery.pedido_delivery.pedido.application.service.PedidoRepository;
import br.com.delivery.pedido_delivery.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PedidoInfraRepository implements PedidoRepository {
    private final PedidoSprinDataJPARepository pedidoSprinDataJPARepository;

    @Override
    public Pedido salvaPedido(Pedido pedido) {
        log.info("[start] PedidoInfraRepository - salvaPedido");
        pedidoSprinDataJPARepository.save(pedido);
        log.info("[finish] PedidoInfraRepository - salvaPedido");
        return pedido;
    }
}
