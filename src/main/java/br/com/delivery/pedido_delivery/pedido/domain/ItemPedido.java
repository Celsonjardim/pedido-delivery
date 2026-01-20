package br.com.delivery.pedido_delivery.pedido.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idItem;
    @NotBlank
    private String nomeProduto;
    @NotNull
    private Integer quantidade;
    @NotNull
    private BigDecimal precoUnitario;
}
