package br.com.delivery.pedido_delivery.entrega.application.service;

import br.com.delivery.pedido_delivery.entrega.domain.Entrega;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EntregaRepository {
    Entrega salvaEntrega(Entrega entrega);
    List<Entrega> buscaTodasEntregas(UUID idCliente, UUID idPedido);
    Entrega buscaEntregaDoCliente(UUID idEntrega);
    void deletaEntrega(Entrega entrega);
}
