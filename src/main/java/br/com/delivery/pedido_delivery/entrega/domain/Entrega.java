package br.com.delivery.pedido_delivery.entrega.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    private UUID idPedidoEntreda;
    @NotNull
    @Embedded
    private EnderecoEntrega enderecoDaEntrega;
    @Enumerated(EnumType.STRING)
    private StatusEntrega statusEntrega;
    @Column(name = "data_envio")
    private LocalDateTime dataEnvio;
    @Column(name = "data_entrega")
    private LocalDateTime dataEntrega;

    private LocalDateTime dataDoCadastro;
    private LocalDateTime dataUltimaAlterecao;
}
