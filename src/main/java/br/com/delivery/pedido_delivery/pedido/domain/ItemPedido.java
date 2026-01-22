package br.com.delivery.pedido_delivery.pedido.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.util.UUID;

@Entity
@Value
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idItem;
    @NotBlank
    private String nomeProduto;
    @NotNull
    private String quantidade;
    @NotNull
    private String precoUnitario;
}
