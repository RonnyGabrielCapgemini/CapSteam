package com.example.spring.model;


import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="juegos")
public class Juego {
	private int rank;
	private String name;
	private String platform;
	private int year;
	private String genre;
	private String publisher;
	private BigInteger nasales;
	private BigInteger eusales;
	private BigInteger jpsales;
	private BigInteger otherssales;
	private BigInteger globalsales;
	
	public Juego() {
		super();
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public BigInteger getNasales() {
		return nasales;
	}
	public void setNasales(BigInteger nasales) {
		this.nasales = nasales;
	}
	public BigInteger getEusales() {
		return eusales;
	}
	public void setEusales(BigInteger eusales) {
		this.eusales = eusales;
	}
	public BigInteger getJpsales() {
		return jpsales;
	}
	public void setJpsales(BigInteger jpsales) {
		this.jpsales = jpsales;
	}
	public BigInteger getOtherssales() {
		return otherssales;
	}
	public void setOtherssales(BigInteger otherssales) {
		this.otherssales = otherssales;
	}
	public BigInteger getGlobalsales() {
		return globalsales;
	}
	public void setGlobalsales(BigInteger globalsales) {
		this.globalsales = globalsales;
	}
	
}
