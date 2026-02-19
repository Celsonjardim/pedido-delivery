package br.com.delivery.pedido_delivery.entrega.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/pedido/{idPedido}/entrega")
public interface EntregaAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    EntregaResponse postEntrega(@PathVariable UUID idCliente,
                                @PathVariable UUID idPedido,
                                @Valid @RequestBody EntregaRequest entregaRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<EntregasListResponse> getTodasEntrega(@PathVariable UUID idCliente,
                         @PathVariable UUID idPedido);

    @GetMapping(value = "/{idEntrega}")
    @ResponseStatus(code = HttpStatus.OK)
    EntregaDetalhadoResponse getEntregaDoClienteComID(@PathVariable UUID idCliente,
                                                            @PathVariable UUID idPedido,
                                                            @PathVariable UUID idEntrega);

    @DeleteMapping(value = "/{idEntrega}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteEntregaDoClienteComID(@PathVariable UUID idCliente,
                                                      @PathVariable UUID idPedido,
                                                      @PathVariable UUID idEntrega);

    @PatchMapping(value = "/{idEntrega}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraEntrega(@PathVariable UUID idCliente,
                                       @PathVariable UUID idPedido,
                                       @PathVariable UUID idEntrega,
                                       @Valid @RequestBody EntregaAlteracaoRequest entregaAlteracaoRequest);
}
