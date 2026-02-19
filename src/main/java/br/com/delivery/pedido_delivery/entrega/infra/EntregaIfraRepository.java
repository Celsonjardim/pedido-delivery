package br.com.delivery.pedido_delivery.entrega.infra;

import br.com.delivery.pedido_delivery.entrega.application.service.EntregaRepository;
import br.com.delivery.pedido_delivery.entrega.domain.Entrega;
import br.com.delivery.pedido_delivery.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EntregaIfraRepository implements EntregaRepository {
    private final EntregaSpringDataJPARepository entregaSpringDataJPARepository;

    @Override
    public Entrega salvaEntrega(Entrega entrega) {
        log.info("[start] EntregaIfraRepository - salvaEntrega");
        entregaSpringDataJPARepository.save(entrega);
        log.info("[finish] EntregaIfraRepository - salvaEntrega");
        return entrega;
    }

    @Override
    public List<Entrega> buscaTodasEntregas(UUID idCliente, UUID idPedido) {
        log.info("[start] EntregaIfraRepository - buscaTodasEntregas");
        var entregas = entregaSpringDataJPARepository.findByIdPedidoEntrega(idPedido);
        log.info("[finish] EntregaIfraRepository - buscaTodasEntregas");
        return entregas;
    }

    @Override
    public Entrega buscaEntregaDoCliente(UUID idEntrega) {
        log.info("[start] EntregaIfraRepository - buscaEntregaDoCliente");
        var entrega = entregaSpringDataJPARepository.findById(idEntrega)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Entrega não encontrada para esse idEntrega " + idEntrega));
        log.info("[finish] EntregaIfraRepository - buscaEntregaDoCliente");
        return entrega;
    }
}
