package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.example.spring.model.Juego;


public interface JuegoService {
	
		// LISTAR LOS JUEGOS
		public List<Juego>findAll();
		
		// RECUPERAR POR ID
		public Optional<Juego>findById(int id);
		
		// MODIFICAR
		public void save(Juego juego);
				
			
		// BORRAR
		public void deleteJuego(int id);
		
		//Listar por publisher
		public List<Juego> findOrderByPublisher();
		public List<Juego> findAllByOrderByGenre();
		public List<Juego> findBySiglo(int year);
		public List<Juego> findByPar();
		public List<Juego> findAllByOrderByEusales();
		public List<Juego> findAllByOrderByNintendo();
		

}
