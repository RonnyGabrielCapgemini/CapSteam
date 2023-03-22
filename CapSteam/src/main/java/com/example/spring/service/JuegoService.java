package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import com.example.spring.model.Juego;



public interface JuegoService {
	
		// LISTAR
		public List<Juego>findAll();
		
		// RECUPERAR POR ID
		public Optional<Juego>findById(int id);
		
		// MODIFICAR
		public void saveJuego(Juego juego);
		
		// AÑADIR
		public void addJuego(String name);
		
		// BORRAR
		public void deleteJuego(int id);

}
