package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Juego;
import com.example.spring.repository.JuegoDAO;



@Service
public class JuegoServiceImpl implements JuegoService {
	
	@Autowired
	JuegoDAO juegoDao;
	
	public List<Juego> findAll(){
    	return juegoDao.findAll();
    }
   
	
	@Override
	public Optional<Juego> findById(int id){
		return juegoDao.findById(id);
	}
	
	@Override
	public void saveJuego(Juego juego) {
		juegoDao.save(juego);
	}
	
	@Override
	public void deleteJuego(int id) {
		juegoDao.deleteById(id);
	}


	@Override
	public void addJuego(String name) {
		juegoDao.addJuego(name);
		
	}

	

}



