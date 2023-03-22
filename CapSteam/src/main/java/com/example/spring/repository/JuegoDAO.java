package com.example.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Juego;



@Repository
public interface JuegoDAO extends JpaRepository<Juego, Integer>  {
	
	public void addJuego(String name);
		
	

}
