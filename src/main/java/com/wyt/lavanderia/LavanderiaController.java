package com.wyt.lavanderia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LavanderiaController {
	
	@Autowired
	private LavanderiaService lavanderiasService;

	@RequestMapping("/lavanderia/getByAddress/{address}")
	public @ResponseBody List<Lavanderia> listByAddress(@PathVariable("address") String address) {
		return lavanderiasService.list(address);
	}
	
	@RequestMapping(value = "/lavanderias")
	public String list(Model model) {
		model.addAttribute("lavanderias", lavanderiasService.list("123"));
		return "listaLavanderias";
	}
	
	

}
