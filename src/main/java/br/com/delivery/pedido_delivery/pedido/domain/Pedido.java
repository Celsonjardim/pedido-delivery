package br.com.delivery.pedido_delivery.pedido.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idPedido;
    @NotBlank
    private String valorDoPedido;
    @Enumerated(EnumType.STRING)
    private StatusPedido statusDoPeido;
    @NotNull
    @OneToMany
    private List<ItemPedido> itensDoPedido;

    private LocalDateTime dataDoPedido;
    private LocalDateTime dataUltimaAlterecao;
}
