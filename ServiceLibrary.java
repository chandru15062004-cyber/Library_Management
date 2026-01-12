package com.example.demo.servicelibrary;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.library.LibraryManagement;

import com.example.demo.repositorylibrary.RepositoryLibrary;


@Service
public class ServiceLibrary {
	
	private final RepositoryLibrary Repository;
	
	public ServiceLibrary(RepositoryLibrary Repository) {
		this.Repository=Repository;
	}
	//get
	public List<LibraryManagement> getAllBooks(){
		return Repository.findAll();
	}
	//get by id
	 public LibraryManagement getBookById(long id) {
		 return Repository.findById(id).orElse(null);
	 }
	 //post
	 public LibraryManagement saveBookDetail(LibraryManagement Library) {
		 return Repository.save(Library);
	 }
	 //put
	 public LibraryManagement updateBookDetails(Long id,LibraryManagement Management) {
		 LibraryManagement Book=Repository.findById(id).orElse(null);
		 if(Book!=null) {
			 Book.setTitle(Management.getTitle());
			 Book.setAuthor(Management.getAuthor());
			 Book.setGenre(Management.getGenre());
			 Book.setPublisher(Management.getPublisher());
			 Book.setYear_Of_Published(Management.getYear_Of_Published());
			 Book.setNumber_of_pages(Management.getNumber_of_pages());
			 Book.setAvailability_Status(Management.isAvailability_Status());
			 Book.setLanguage(Management.getLanguage());
			 Book.setPrice(Management.getPrice());
			 return Repository.save(Book);
			 
		 }
		 return null;
	 }
	 
	 //delete
	 public void deleteBook(Long id) {
		 Repository.deleteById(id);
	 }
}

