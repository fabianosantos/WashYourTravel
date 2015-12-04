package com.wyt.pedido;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

	@RequestMapping("/resource-status")
	public String resourceStatus() {
		return this.getClass().getSimpleName() + " está em funcionamento.";
	}
	
	public Pedido save(Pedido pedido) {
		return null;
	}
	
}
