package br.com.delivery.pedido_delivery.entrega.application.api;

import br.com.delivery.pedido_delivery.entrega.domain.EnderecoEntrega;
import br.com.delivery.pedido_delivery.entrega.domain.StatusEntrega;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class EntregaAlteracaoRequest {
    @Enumerated(EnumType.STRING)
    private StatusEntrega statusEntrega;
    @Column(name = "data_envio")
    private LocalDate dataEnvio;
    @Column(name = "data_entrega")
    private LocalDate dataEntrega;
    @NotNull
    @Embedded
    private EnderecoEntrega enderecoDaEntrega;
}
