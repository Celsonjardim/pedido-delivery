package br.com.delivery.pedido_delivery.pedido.application.api;

import br.com.delivery.pedido_delivery.pedido.application.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {
    private final PedidoService pedidoService;

    @Override
    public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
        log.info("[start] PedidoController - postPedido");
        log.info("[idCliente] {}", idCliente);
        PedidoResponse pedido = pedidoService.criaPedido(idCliente, pedidoRequest);
        log.info("[finish] PedidoController - postPedido");
        return pedido;
    }
}
