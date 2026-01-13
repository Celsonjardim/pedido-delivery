package br.com.delivery.pedido_delivery.cliente.application.api;

import br.com.delivery.pedido_delivery.cliente.domain.EnderecoCliente;
import br.com.delivery.pedido_delivery.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
    private String cpf;
    private Sexo sexo;
    private EnderecoCliente enderecoCliente;
    private LocalDateTime dataDoCadastro;
}
