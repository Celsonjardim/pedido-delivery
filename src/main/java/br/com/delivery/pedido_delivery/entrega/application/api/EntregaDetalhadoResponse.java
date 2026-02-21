package br.com.delivery.pedido_delivery.entrega.application.api;

import br.com.delivery.pedido_delivery.entrega.domain.EnderecoEntrega;
import br.com.delivery.pedido_delivery.entrega.domain.Entrega;
import br.com.delivery.pedido_delivery.entrega.domain.StatusEntrega;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class EntregaDetalhadoResponse {
    private UUID idEntrega;
    private UUID idClienteEntrega;
    private UUID idPedidoEntrega;
    private EnderecoEntrega enderecoDaEntrega;
    private StatusEntrega statusEntrega;
    private LocalDate dataEnvio;
    private LocalDate dataEntrega;

    public EntregaDetalhadoResponse(Entrega entrega) {
        this.idEntrega = entrega.getIdEntrega();
        this.idClienteEntrega = entrega.getIdClienteEntrega();
        this.idPedidoEntrega = entrega.getIdPedidoEntrega();
        this.enderecoDaEntrega = entrega.getEnderecoDaEntrega();
        this.statusEntrega = entrega.getStatusEntrega();
        this.dataEnvio = entrega.getDataEnvio();
        this.dataEntrega = entrega.getDataEntrega();
    }
}
