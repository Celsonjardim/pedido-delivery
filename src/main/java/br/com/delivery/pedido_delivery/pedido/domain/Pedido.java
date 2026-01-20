package br.com.delivery.pedido_delivery.pedido.domain;

import br.com.delivery.pedido_delivery.cliente.domain.Cliente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID idPedido;
    @NotNull
    private Cliente cliente;
    @NotBlank
    private BigDecimal valorDoPedido;
    @Enumerated(EnumType.STRING)
    private StatusPedido statusDoPeido;
    @NotNull
    @Embedded
    private List<ItemPedido> itensDoPedido;

    private LocalDateTime dataDoPedido;
    private LocalDateTime dataUltimaAlterecao;
}
