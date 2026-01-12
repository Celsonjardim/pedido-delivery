package br.com.delivery.pedido_delivery.cliente.application.api;

import br.com.delivery.pedido_delivery.cliente.domain.Cliente;
import br.com.delivery.pedido_delivery.cliente.domain.EnderecoCliente;
import br.com.delivery.pedido_delivery.cliente.domain.Sexo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
@JsonPropertyOrder({"idCliente", "nomeCompleto", "email", "celular", "cpf", "sexo", "enderecoCliente"})
public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
    private String cpf;
    private Sexo sexo;
    private EnderecoCliente enderecoCliente;

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClienteListResponse::new)
                .collect(Collectors.toList());
    }

    public ClienteListResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
        this.sexo = cliente.getSexo();
        this.enderecoCliente = cliente.getEnderecoCliente();
    }
}
