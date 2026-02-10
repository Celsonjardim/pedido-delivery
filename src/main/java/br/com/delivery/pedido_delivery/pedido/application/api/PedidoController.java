package br.com.delivery.pedido_delivery.pedido.application.api;

import br.com.delivery.pedido_delivery.pedido.application.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @Override
    public List<PedidoClienteListResponse> getPedidosDoCliente(UUID idCliente) {
        log.info("[start] PedidoController - getPedidosDoCliente");
        log.info("[idCliente] {}", idCliente);
        List<PedidoClienteListResponse> pedidosDoCliente = pedidoService.buscaPedidosDoClienteComID(idCliente);
        log.info("[finish] PedidoController - getPedidosDoCliente");
        return pedidosDoCliente;
    }

    @Override
    public PedidoClienteDetalhadoResponse getPedidoDoClienteComID(UUID idCliente, UUID idPedido) {
        log.info("[start] PedidoController - getPedidoDoClienteComID");
        log.info("[idCliente] {} - [idPedido] {}", idCliente, idPedido);
        PedidoClienteDetalhadoResponse pedido = pedidoService.buscaPedidoDoClienteComID(idCliente, idPedido);
        log.info("[finish] PedidoController - getPedidoDoClienteComID");
        return pedido;
    }

    @Override
    public void deletaPedidoDoClienteComID(UUID idCliente, UUID idPedido) {
        log.info("[start] PedidoController - deletaPedidoDoClienteComID");
        log.info("[idCliente] {} - [idPedido] {}", idCliente, idPedido);
        pedidoService.deletaPedidoDoClienteComID(idCliente, idPedido);
        log.info("[finish] PedidoController - deletaPedidoDoClienteComID");
    }

    @Override
    public void patchPedido(UUID idCliente, UUID idPedido, PedidoAlteracaoRequest pedidoAlteracaoRequest) {
        log.info("[start] PedidoController - patchPedido");
        log.info("[idCliente] {} - [idPedido] {}", idCliente, idPedido);
        pedidoService.alteraPedidoDoClienteComId(idCliente, idPedido, pedidoAlteracaoRequest);
        log.info("[finish] PedidoController - patchPedido");
    }
}
