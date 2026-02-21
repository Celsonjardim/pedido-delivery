package br.com.delivery.pedido_delivery.pedido.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

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
    private String quantidade;
    @NotNull
    private String precoUnitario;
    @ManyToOne
    @JoinColumn(name = "idPedido")
    @JsonBackReference
    private Pedido pedido;
}
