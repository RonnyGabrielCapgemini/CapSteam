package com.example.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.spring.model.Juego;
import com.example.spring.repository.JuegoDAO;

// -- Para hacer una prueba unitaria a una entidad
@DataJpaTest
// -- Indicar que haga la operacion a la bbdd
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class JuegoTest {
	
	@Autowired
	private JuegoDAO juegoDao;
	
	// -- Que busque por nombre en la base de datos
	@Test
	public void findGameByName() {
		String nombre = "Juan";
		Juego juego =  juegoDao.findByName(nombre);
		assertThat(juego.getName()).isEqualTo(nombre);
	}
	
	// -- Que bisque un nombre que no exista
	@Test
	public void findByGameNoExist() {
		String nombre = "Cancun";
		Juego juego =  juegoDao.findByName(nombre);
		
		assertNull(juego);
	}
	
	


}
