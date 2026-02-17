package br.com.delivery.pedido_delivery.entrega.application.service;

import br.com.delivery.pedido_delivery.entrega.application.api.EntregaRequest;
import br.com.delivery.pedido_delivery.entrega.application.api.EntregaResponse;
import br.com.delivery.pedido_delivery.entrega.application.api.EntregasListResponse;
import br.com.delivery.pedido_delivery.entrega.domain.Entrega;
import br.com.delivery.pedido_delivery.pedido.application.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class EntregaApplicationService implements EntregaService {
    private final PedidoService pedidoService;
    private final EntregaRepository entregaRepository;

    @Override
    public EntregaResponse criaEntrega(UUID idCliente, UUID idPedido, @Valid EntregaRequest entregaRequest) {
        log.info("[start] EntregaApplicationService - criaEntrega");
        pedidoService.buscaPedidoDoClienteComID(idCliente, idPedido);
        Entrega entrega = entregaRepository.salvaEntrega(new Entrega(idCliente, idPedido, entregaRequest));
        return new EntregaResponse(entrega.getIdEntrega());
    }

    @Override
    public List<EntregasListResponse> buscaTodasEntregas(UUID idCliente, UUID idPedido) {
        log.info("[start] EntregaApplicationService - buscaTodasEntregas");
        pedidoService.buscaPedidoDoClienteComID(idCliente, idPedido);
        List<Entrega> todasEntregas = entregaRepository.buscaTodasEntregas(idCliente, idPedido);
        log.info("[finish] EntregaApplicationService - buscaTodasEntregas");
        return EntregasListResponse.converte(todasEntregas);
    }
}