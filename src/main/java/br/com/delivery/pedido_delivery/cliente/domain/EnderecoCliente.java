package br.com.delivery.pedido_delivery.cliente.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class EnderecoCliente {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
