package br.com.delivery.pedido_delivery.entrega.application.api;

import br.com.delivery.pedido_delivery.entrega.application.service.EntregaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EntregaController implements EntregaAPI {
    private final EntregaService entregaService;

    @Override
    public EntregaResponse postEntrega(UUID idCliente, UUID idPedido, @Valid EntregaRequest entregaRequest) {
        log.info("[start] EntregaController - postEntrega");
        log.info("[idCliente] {} - [idPedido] {}", idCliente, idPedido);
        EntregaResponse entrega = entregaService.criaEntrega(idCliente, idPedido, entregaRequest);
        log.info("[finish] EntregaController - postEntrega");
        return entrega;
    }

    @Override
    public List<EntregasListResponse> getTodasEntrega(UUID idCliente, UUID idPedido) {
        log.info("[start] EntregaController - getTodasEntrega");
        log.info("[idCliente] {} - [idPedido] {}", idCliente, idPedido);
        List<EntregasListResponse> entregasDoCliente = entregaService.buscaTodasEntregas(idCliente, idPedido);
        log.info("[finish] EntregaController - getTodasEntrega");
        return entregasDoCliente;
    }

    @Override
    public EntregaDetalhadoResponse getEntregaDoClienteComID(UUID idCliente, UUID idPedido, UUID idEntrega) {
        log.info("[start] EntregaController - getEntregaDoClienteComID");
        log.info("[idCliente] {} - [idPedido] {} - [idEntrega] {}", idCliente, idPedido, idEntrega);
        EntregaDetalhadoResponse entrega = entregaService.buscaEntregaDoClienteComID(idCliente, idPedido, idEntrega);
        log.info("[finish] EntregaController - getEntregaDoClienteComID");
        return entrega;
    }
}
