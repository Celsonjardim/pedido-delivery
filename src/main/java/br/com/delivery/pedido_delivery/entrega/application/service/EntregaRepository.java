package br.com.delivery.pedido_delivery.entrega.application.service;

import br.com.delivery.pedido_delivery.entrega.domain.Entrega;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository {
    Entrega salvaEntrega(Entrega entrega);
}
