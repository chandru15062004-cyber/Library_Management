	package com.example.demo.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Library_Management")
@Getter
@Setter
public class LibraryManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String author;
	private String genre;
	private String publisher;
	private String year_Of_Published;
	private long number_of_pages;
	private boolean availability_Status;
	private String language;
	private float price;

	public LibraryManagement() {
		
	}
	public LibraryManagement(String Title,String Author,String Genre,String Publisher,String Year_Of_Published,long Number_of_Pages,boolean Availability_Status,String Language,float Price) {
		this.title=Title;
		this.author=Author;
		this.genre=Genre;
		this.publisher=Publisher;
		this.year_Of_Published=Year_Of_Published;
		this.number_of_pages=Number_of_Pages;
		this.availability_Status=Availability_Status;
		this.language=Language;
		this.price=Price;
	}
}

