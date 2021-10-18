package com.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.Repository.ProovedoresRepository;


@Controller
@RequestMapping("/proovedores")//http:localhost:8383/proovedopres
public class ProovedoresController {
	@Autowired
	private ProovedoresRepository proovedoresRepository;
	@GetMapping("")
	public String proovedores(Model model) {
		model.addAttribute("proovedores", proovedoresRepository.findAll());
		return "proovedores";
	}
}
