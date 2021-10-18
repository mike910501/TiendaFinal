package com.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.Repository.VentasRepository;



@Controller
@RequestMapping("/ventas")//http:localhost:8383/ventas
public class VentasController {
	@Autowired
	private VentasRepository ventasRepository;
	@GetMapping("")
	public String ventas(Model model) {
		model.addAttribute("clientes", ventasRepository.findAll());
		return "clientes";
	}

}
