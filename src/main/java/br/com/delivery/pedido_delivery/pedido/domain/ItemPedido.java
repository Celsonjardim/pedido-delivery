package br.com.delivery.pedido_delivery.pedido.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Embeddable
@Data
public class ItemPedido {
    @Id
    private UUID idItem;
    @NotBlank
    private String nomeProduto;
    @NotBlank
    private Integer quantidade;
    @NotBlank
    private BigDecimal precoUnitario;
}
