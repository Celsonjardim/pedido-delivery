package br.com.delivery.pedido_delivery.pedido.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/pedido")
public interface PedidoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PedidoResponse postPedido(@PathVariable("idCliente") UUID idCliente,
                              @Valid @RequestBody PedidoRequest PedidoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<PedidoClienteListResponse> getPedidosDoCliente(@PathVariable UUID idCliente);

    @GetMapping(value = "/{idPedido}")
    @ResponseStatus(code = HttpStatus.OK)
    PedidoClienteDetalhadoResponse getPedidoDoClienteComID(@PathVariable UUID idCliente, @PathVariable UUID idPedido);

    @DeleteMapping(value = "/{idPedido}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaPedidoDoClienteComID(@PathVariable UUID idCliente, @PathVariable UUID idPedido);


}