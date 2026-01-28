package br.com.delivery.pedido_delivery.pedido.domain;

import br.com.delivery.pedido_delivery.pedido.application.api.PedidoRequest;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPedido", updatable = false, unique = true, nullable = false)
    private UUID idPedido;
    @NotNull
    private UUID idClientePedido;
    @NotBlank
    private String valorDoPedido;
    @Enumerated(EnumType.STRING)
    private StatusPedido statusDoPeido;
    @NotNull
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ItemPedido> itensDoPedido;

    private LocalDateTime dataDoPedido;
    private LocalDateTime dataUltimaAlterecao;

    public Pedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
        this.idClientePedido = idCliente;
        this.valorDoPedido = pedidoRequest.getValorDoPedido();
        this.statusDoPeido = pedidoRequest.getStatusDoPeido();
        this.itensDoPedido = pedidoRequest.getItensDoPedido()
                .stream()
                .map(item -> {item.setPedido(this);
                return item;
                }).collect(Collectors.toList());
        this.dataDoPedido = LocalDateTime.now();
    }

    public void adicionarItem(ItemPedido item) {
        item.setPedido(this);
        this.itensDoPedido.add(item);
    }

}
