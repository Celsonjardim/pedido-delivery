package br.com.delivery.pedido_delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PedidoDeliveryApplication {
	@GetMapping
	public String getHomeTeste(){
		return "Pedido Delivery - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(PedidoDeliveryApplication.class, args);
	}

}
