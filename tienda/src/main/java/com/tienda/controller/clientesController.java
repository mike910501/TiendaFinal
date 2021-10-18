package com.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tienda.Repository.clienteRepository;

@Controller
@RequestMapping("/clientes")//http:localhost:8383/usuarios
public class clientesController {
	
	@Autowired
	private clienteRepository ClienteRepository;
	
	@GetMapping("")
	public String cliente(Model model) {
		model.addAttribute("clientes", ClienteRepository.findAll());
		return "clientes";
	}
}
