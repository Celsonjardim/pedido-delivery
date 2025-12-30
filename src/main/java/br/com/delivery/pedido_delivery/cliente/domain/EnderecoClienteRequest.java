package br.com.delivery.pedido_delivery.cliente.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class EnderecoClienteRequest {
    @NotBlank
    private String rua;
    @NotBlank
    private String numero;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotBlank
    private String estado;
    @NotBlank
    private String cep;
}
