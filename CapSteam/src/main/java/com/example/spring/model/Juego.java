package com.example.spring.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="juegos")
public class Juego {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="ranking")
	private int rank;
	@Column(name="name")
	private String name;
	@Column(name="platform")
	private String platform;
	@Column(name="year")
	private int year;
	@Column(name="genre")
	private String genre;
	@Column(name="publisher")
	private String publisher;
	@Column(name="nasales")	
	private Double na_sales;
	@Column(name="eusales")
	private Double eu_sales;
	@Column(name="jpsales")
	private Double jp_sales;
	@Column(name="othersales")
	private Double other_sales;
	@Column(name="globalsales")
	private Double global_sales;
	
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
	public Double getNa_sales() {
		return na_sales;
	}

	public void setNa_sales(Double na_sales) {
		this.na_sales = na_sales;
	}
	public Double getEu_sales() {
		return eu_sales;
	}

	public void setEu_sales(Double eu_sales) {
		this.eu_sales = eu_sales;
	}
	public Double getJp_sales() {
		return jp_sales;
	}

	public void setJp_sales(Double jp_sales) {
		this.jp_sales = jp_sales;
	}
	public Double getOther_sales() {
		return other_sales;
	}

	public void setOther_sales(Double other_sales) {
		this.other_sales = other_sales;
	}
	public Double getGlobal_sales() {
		return global_sales;
	}

	public void setGlobal_sales(Double global_sales) {
		this.global_sales = global_sales;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Juego [id=" + id + ", rank=" + rank + ", name=" + name + ", platform=" + platform + ", year=" + year
				+ ", genre=" + genre + ", publisher=" + publisher + ", na_sales=" + na_sales + ", eu_sales=" + eu_sales
				+ ", jp_sales=" + jp_sales + ", other_sales=" + other_sales + ", global_sales=" + global_sales + "]";
	}
	
	
}
