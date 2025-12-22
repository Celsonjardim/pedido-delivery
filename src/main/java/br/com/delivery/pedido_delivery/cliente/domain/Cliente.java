package br.com.delivery.pedido_delivery.cliente.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
    private String email;
    @NotBlank
    private String celular;
    @CPF
    private String cpf;
    private Sexo sexo;
    @NotBlank
    private EnderecoCliente enderecoCliente;

    private LocalDateTime dataDoCadastro;
    private LocalDateTime dataUltimaAlterecao;

    public Cliente(String nomeCompleto, String email, String celular,
                   String cpf, Sexo sexo, EnderecoCliente enderecoCliente) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.celular = celular;
        this.cpf = cpf;
        this.sexo = sexo;
        this.enderecoCliente = enderecoCliente;
        this.dataDoCadastro = LocalDateTime.now();
    }
}
