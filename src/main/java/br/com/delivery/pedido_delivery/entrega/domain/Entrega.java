package br.com.delivery.pedido_delivery.entrega.domain;

import br.com.delivery.pedido_delivery.entrega.application.api.EntregaRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEntrega", updatable = false, unique = true, nullable = false)
    private UUID idEntrega;
    @NotNull
    private UUID idClienteEntrega;
    @NotNull
    private UUID idPedidoEntrega;
    @NotNull
    @Embedded
    private EnderecoEntrega enderecoDaEntrega;
    @Enumerated(EnumType.STRING)
    private StatusEntrega statusEntrega;
    @Column(name = "data_envio")
    private LocalDate dataEnvio;
    @Column(name = "data_entrega")
    private LocalDate dataEntrega;

    private LocalDateTime dataDoCadastro;
    private LocalDateTime dataUltimaAlterecao;

    public Entrega(UUID idCliente, UUID idPedido, @Valid EntregaRequest entregaRequest) {
        this.idClienteEntrega = idCliente;
        this.idPedidoEntrega = idPedido;
        this.enderecoDaEntrega = entregaRequest.getEnderecoDaEntrega();
        this.statusEntrega = entregaRequest.getStatusEntrega();
        this.dataEnvio = entregaRequest.getDataEnvio();
        this.dataEntrega = entregaRequest.getDataEntrega();
        this.dataDoCadastro = LocalDateTime.now();
    }

}
