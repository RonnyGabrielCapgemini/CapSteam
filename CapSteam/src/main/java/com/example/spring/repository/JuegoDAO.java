package com.example.spring.repository;


//import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Juego;



@Repository
public interface JuegoDAO extends JpaRepository<Juego, Integer>  {
	
	// LISTAR
	//public List<Juego> findAll();
	
	// RECUPERAR EL JUEGO POR SU ID
	//public Optional<Juego>findById(int id);
	
	// ELIMINAR
	//public void deleteJuego(int id);
		
	

}
