package br.com.delivery.pedido_delivery.pedido.application.api;

import br.com.delivery.pedido_delivery.pedido.domain.ItemPedido;
import br.com.delivery.pedido_delivery.pedido.domain.StatusPedido;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;

@Value
public class PedidoRequest {
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
