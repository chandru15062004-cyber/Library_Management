package com.example.demo.controllerlibrary;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.library.LibraryManagement;
import com.example.demo.servicelibrary.ServiceLibrary;

@RestController
@RequestMapping("/libraryManagement")
public class LibraryController {
	
	private final ServiceLibrary ServiceLibrary;

	public LibraryController(ServiceLibrary ServiceLibrary) {
		this.ServiceLibrary=ServiceLibrary;
	}            //->Contructor

	@GetMapping
	public List<LibraryManagement> getLibrary() {
		return ServiceLibrary.getAllBooks();
	}   		//->To get entire data at a time

	@GetMapping("/{id}")
	public LibraryManagement getById(@PathVariable Long id) {
		return ServiceLibrary.getBookById(id);
	}			//->To get sprcifice data by giving specific ID

	@PostMapping
	public LibraryManagement save(@RequestBody LibraryManagement Library) {
		return ServiceLibrary.saveBookDetail(Library);
	}			//->To create new resource
	
	@PutMapping("/{id}")
	public LibraryManagement update(@PathVariable Long id, @RequestBody LibraryManagement Library) {
		return ServiceLibrary.updateBookDetails(id, Library);
	}			//->To update specifce resuorce  by giving ID
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		ServiceLibrary.deleteBook(id);
		return "Book was deleted succesfully from the Library"; 
	}			//->To delete resource

}

