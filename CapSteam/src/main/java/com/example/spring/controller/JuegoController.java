package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring.service.JuegoService;

@Controller
public class JuegoController {
	
	@Autowired
	JuegoService service;
	
	//-- LISTAR LOS JUEGOS DESDE LA URL "/"--
		@GetMapping("/")
		public String listJuego(Model m) {
			m.addAttribute("lista", service.findAll());
			return "Lista";
		}
		
	//-- EDITAR EL JUEGO POR SU ID A TRAVES DE LA URL "/edit" --
		@GetMapping("/edit")
		public String editJuego(@RequestParam("id") int id, Model m) {
			m.addAttribute("juego", service.findById(id));
			return "JuegoForm";
		}
		

}
