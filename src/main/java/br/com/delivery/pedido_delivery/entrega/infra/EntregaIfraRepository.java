package br.com.delivery.pedido_delivery.entrega.infra;

import br.com.delivery.pedido_delivery.entrega.application.service.EntregaRepository;
import br.com.delivery.pedido_delivery.entrega.domain.Entrega;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

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
}
