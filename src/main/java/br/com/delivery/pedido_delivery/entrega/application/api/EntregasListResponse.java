package br.com.delivery.pedido_delivery.entrega.application.api;

import br.com.delivery.pedido_delivery.entrega.domain.EnderecoEntrega;
import br.com.delivery.pedido_delivery.entrega.domain.Entrega;
import br.com.delivery.pedido_delivery.entrega.domain.StatusEntrega;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class EntregasListResponse {
    private UUID idEntrega;
    private EnderecoEntrega enderecoDaEntrega;
    private StatusEntrega statusEntrega;
    private LocalDate dataEnvio;
    private LocalDate dataEntrega;

    public static List<EntregasListResponse> converte(List<Entrega> todasEntregas) {
        return todasEntregas.stream()
                .map(EntregasListResponse::new)
                .collect(Collectors.toList());
    }

    public EntregasListResponse(Entrega entrega) {
        this.idEntrega = entrega.getIdEntrega();
        this.enderecoDaEntrega = entrega.getEnderecoDaEntrega();
        this.statusEntrega = entrega.getStatusEntrega();
        this.dataEnvio = entrega.getDataEnvio();
        this.dataEntrega = entrega.getDataEntrega();
    }
}
