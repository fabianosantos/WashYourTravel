package com.wyt.pedido;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wyt.lavanderia.Lavanderia;
import com.wyt.lavanderia.LavanderiaService;

@Controller
public class PedidoController {
	
	@Autowired
	private LavanderiaService lavanderiasService;

	@RequestMapping("/resource-status")
	public String resourceStatus() {
		return this.getClass().getSimpleName() + " está em funcionamento.";
	}
	
	@RequestMapping(value = "/pedido/novo")
	public String novoPedido(Model model, @RequestParam(required=true,value="lavanderia") String lavanderiaId) {
		Lavanderia lavanderia = lavanderiasService.getById(lavanderiaId);
		model.addAttribute("lavanderia", lavanderia );
		Pedido pedido = new Pedido();
		pedido.setCodigoLavanderia(lavanderiaId);
		model.addAttribute("pedido", pedido );
		model.addAttribute("tiposItem", Arrays.asList(ItemType.values()));
		return "criarPedido";
	}
	
	public Pedido save(Pedido pedido) {
		return null;
	}
	
}
