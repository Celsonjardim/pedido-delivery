package br.com.delivery.pedido_delivery.cliente.application.api;

import br.com.delivery.pedido_delivery.cliente.domain.EnderecoCliente;
import br.com.delivery.pedido_delivery.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

@Value
public class ClienteRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String celular;
    @CPF
    private String cpf;
    private Sexo sexo;
    @NotNull
    private EnderecoCliente enderecoCliente;

}
