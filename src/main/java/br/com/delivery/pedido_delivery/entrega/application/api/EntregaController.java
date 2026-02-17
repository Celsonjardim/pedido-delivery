package br.com.delivery.pedido_delivery.entrega.application.api;

import br.com.delivery.pedido_delivery.entrega.application.service.EntregaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EntregaController implements EntregaAPI {
    private final EntregaService entregaService;

    @Override
    public EntregaResponse postEntrega(UUID idCliente, UUID idPedido, @Valid EntregaRequest entregaRequest) {
        log.info("[start] EntregaController - postEntrega");
        log.info("[idPedido] {}",  idPedido);
        EntregaResponse entrega = entregaService.criaEntrega(idCliente, idPedido, entregaRequest);
        log.info("[finish] EntregaController - postEntrega");
        return entrega;
    }
}
