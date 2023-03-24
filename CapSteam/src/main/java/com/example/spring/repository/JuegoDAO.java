package com.example.spring.repository;


import java.util.List;

//import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Juego;



@Repository
public interface JuegoDAO extends JpaRepository<Juego, Integer>  {

	
	public Juego findByName(String name);

	public List<Juego> findAllByOrderByPublisher();
	public List<Juego> findAllByOrderByGenre();
	 @Query("SELECT e from Juego e where e.year <:year ")     
	public List<Juego> findBySiglo(@Param("year") int year);
	 
	@Query("SELECT e from Juego e where e.year%2=0 ORDER BY e.eu_sales")  
	public List<Juego> findByPar();
	@Query("SELECT e from Juego e ORDER BY e.eu_sales")
	public List<Juego> findAllByOrderByEusales();
	@Query("SELECT e from Juego e where e.publisher='Nintendo' ")
	public List<Juego> findAllByOrderByNintendo();

		
	

}
