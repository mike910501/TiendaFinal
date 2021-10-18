package com.tienda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.Repository.UsuarioRepository;


@Controller
@RequestMapping("/usuarios")//http:localhost:8383/usuarios
public class usuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("")
	public String index(Model model) {
		model.addAttribute("usuarios", usuarioRepository.findAll());
		return "index";
	}

}
