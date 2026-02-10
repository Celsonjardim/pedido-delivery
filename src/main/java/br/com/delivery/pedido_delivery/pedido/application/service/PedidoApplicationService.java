package br.com.delivery.pedido_delivery.pedido.application.service;

import br.com.delivery.pedido_delivery.cliente.application.service.ClienteService;
import br.com.delivery.pedido_delivery.pedido.application.api.*;
import br.com.delivery.pedido_delivery.pedido.domain.Pedido;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService {
    private final ClienteService clienteService;
    private final PedidoRepository pedidoRepository;

    @Override
    public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
        log.info("[start] PedidoApplicationService - criaPedido");
        clienteService.buscaClienteAtravesId(idCliente);
        Pedido pedido = pedidoRepository.salvaPedido(new Pedido(idCliente, pedidoRequest));
        log.info("[finish] PedidoApplicationService - criaPedido");
        return new PedidoResponse(pedido.getIdPedido());
    }

    @Override
    public List<PedidoClienteListResponse> buscaPedidosDoClienteComID(UUID idCliente) {
        log.info("[start] PedidoApplicationService - buscaPedidosDoClienteComID");
        clienteService.buscaClienteAtravesId(idCliente);
        List<Pedido> pedidoDoCliente = pedidoRepository.buscaPedidosDoClienteComID(idCliente);
        log.info("[finish] PedidoApplicationService - buscaPedidosDoClienteComID");
        return PedidoClienteListResponse.converte(pedidoDoCliente);
    }

    @Override
    public PedidoClienteDetalhadoResponse buscaPedidoDoClienteComID(UUID idCliente, UUID idPedido) {
        log.info("[start] PedidoApplicationService - buscaPedidoDoClienteComID");
        clienteService.buscaClienteAtravesId(idCliente);
        Pedido pedido = pedidoRepository.buscaPedidoPeloId(idPedido);
        log.info("[finish] PedidoApplicationService - buscaPedidoDoClienteComID");
        return new PedidoClienteDetalhadoResponse(pedido);
    }

    @Override
    public void deletaPedidoDoClienteComID(UUID idCliente, UUID idPedido) {
        log.info("[start] PedidoApplicationService - deletaPedidoDoClienteComID");
        clienteService.buscaClienteAtravesId(idCliente);
        Pedido pedido = pedidoRepository.buscaPedidoPeloId(idPedido);
        pedidoRepository.deletaPedido(pedido);
        log.info("[finish] PedidoApplicationService - deletaPedidoDoClienteComID");
    }

    @Override
    public void alteraPedidoDoClienteComId(UUID idCliente, UUID idPedido, PedidoAlteracaoRequest pedidoAlteracaoRequest) {
        log.info("[start] PedidoApplicationService - alteraPedidoDoClienteComId");
        clienteService.buscaClienteAtravesId(idCliente);
        Pedido pedido = pedidoRepository.buscaPedidoPeloId(idPedido);
        pedido.altera(pedidoAlteracaoRequest);
        pedidoRepository.salvaPedido(pedido);
        log.info("[finish] PedidoApplicationService - alteraPedidoDoClienteComId");
    }
}
