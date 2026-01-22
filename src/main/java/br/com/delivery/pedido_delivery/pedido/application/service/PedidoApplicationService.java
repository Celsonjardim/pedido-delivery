package br.com.delivery.pedido_delivery.pedido.application.service;

import br.com.delivery.pedido_delivery.pedido.application.api.PedidoRequest;
import br.com.delivery.pedido_delivery.pedido.application.api.PedidoResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class PedidoApplicationService implements PedidoService {
    @Override
    public PedidoResponse criaPedido(UUID idCliente, PedidoRequest pedidoRequest) {
        log.info("[start] PedidoApplicationService - criaPedido");
        log.info("[finish] PedidoApplicationService - criaPedido");
        return null;
    }
}
