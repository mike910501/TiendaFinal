package com.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.Repository.productoRepository;



@Controller
@RequestMapping("/productos")//http:localhost:8383/proveedores
public class productosController {
	@Autowired
	private productoRepository productoRepository;
	
	@GetMapping("")
	public String productos(Model model) {
		model.addAttribute("productos", productoRepository.findAll());
		return "clientes";
	}
}
