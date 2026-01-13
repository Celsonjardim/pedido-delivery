package br.com.delivery.pedido_delivery.cliente.application.service;

import br.com.delivery.pedido_delivery.cliente.application.api.ClienteDetalhadoResponse;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteListResponse;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteRequest;
import br.com.delivery.pedido_delivery.cliente.application.api.ClienteResponse;
import br.com.delivery.pedido_delivery.cliente.application.repository.ClienteRepository;
import br.com.delivery.pedido_delivery.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finish] ClienteApplicationService - criaCliente");
        return ClienteResponse.builder()
                .idCliente(cliente.getIdCliente())
                .build();
    }

    @Override
    public List<ClienteListResponse> buscaTodosClientes() {
        log.info("[start] ClienteApplicationService - buscaTodosClientes");
        List<Cliente> clientes = clienteRepository.buscaTodosClientes();
        log.info("[finish] ClienteApplicationService - buscaTodosClientes");
        return ClienteListResponse.converte(clientes);
    }

    @Override
    public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
        log.info("[start] ClienteApplicationService - buscaClienteAtravesId");
        log.info("[finish] ClienteApplicationService - buscaClienteAtravesId");
        Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
        return new ClienteDetalhadoResponse(cliente);
    }
}
