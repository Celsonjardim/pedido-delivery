package br.com.delivery.pedido_delivery.pedido.application.api;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
public class PedidoController implements PedidoAPI {
    @Override
    public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest PedidoRequest) {
        log.info("[start] PedidoController - postPedido");
        log.info("[idCliente] {}", idCliente);
        log.info("[finish] PedidoController - postPedido");
        return null;
    }
}
