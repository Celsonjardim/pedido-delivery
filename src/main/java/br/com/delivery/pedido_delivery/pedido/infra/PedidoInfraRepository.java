package br.com.delivery.pedido_delivery.pedido.infra;

import br.com.delivery.pedido_delivery.handler.APIException;
import br.com.delivery.pedido_delivery.pedido.application.service.PedidoRepository;
import br.com.delivery.pedido_delivery.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Pedido> buscaPedidosDoClienteComID(UUID idCliente) {
        log.info("[start] PedidoInfraRepository - buscaPedidosDoClienteComID");
        var pedidos = pedidoSprinDataJPARepository.findByIdClientePedido(idCliente);
        log.info("[finish] PedidoInfraRepository - buscaPedidosDoClienteComID");
        return pedidos;
    }

    @Override
    public Pedido buscaPedidoPeloId(UUID idPedido) {
        log.info("[start] PedidoInfraRepository - buscaPedidoPeloId");
        var pedido = pedidoSprinDataJPARepository.findById(idPedido)
                .orElseThrow(() -> APIException.build(
                        HttpStatus.NOT_FOUND, "Pedido não encontrado para o idPedido = " + idPedido));
        log.info("[finish] PedidoInfraRepository - buscaPedidoPeloId");
        return pedido;
    }
}
