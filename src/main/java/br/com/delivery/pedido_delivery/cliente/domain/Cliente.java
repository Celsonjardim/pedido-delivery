package br.com.delivery.pedido_delivery.cliente.domain;

import br.com.delivery.pedido_delivery.cliente.application.api.ClienteRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    private String celular;
    @CPF
    @Column(unique = true)
    private String cpf;
    private Sexo sexo;
    @NotNull
    @Embedded
    private EnderecoCliente enderecoCliente;

    private LocalDateTime dataDoCadastro;
    private LocalDateTime dataUltimaAlterecao;

    public Cliente(ClienteRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.email = clienteRequest.getEmail();
        this.celular = clienteRequest.getCelular();
        this.cpf = clienteRequest.getCpf();
        this.sexo = clienteRequest.getSexo();
        this.enderecoCliente = clienteRequest.getEnderecoCliente();
        this.dataDoCadastro = LocalDateTime.now();
    }
}
