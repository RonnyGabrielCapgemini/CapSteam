package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
	public List<Juego> findOrderByPublisher() {
		return juegoDao.findAllByOrderByPublisher();
	}
	
	public List<Juego> findAllByOrderByGenre(){
		return juegoDao.findAllByOrderByGenre();
	}
	public List<Juego> findBySiglo(int year){
		return juegoDao.findBySiglo(year);
	}
	public List<Juego> findByPar(){
		return juegoDao.findByPar();
	}
	public List<Juego> findAllByOrderByNintendo(){
		return juegoDao.findAllByOrderByNintendo();
	}
	@Override
	public Optional<Juego> findById(int id){
		return juegoDao.findById(id);
	}
	
	@Override
	public void save(Juego juego) {
		juegoDao.save(juego);
	}
	
	@Override
	public void deleteJuego(int id) {
		juegoDao.deleteById(id);
	}
	@Override
	public List<Juego> findAllByOrderByEusales() {
		return juegoDao.findAllByOrderByEusales();
	}
	


	
	
	
}



