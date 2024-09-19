package com.navin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navin.Entity.Books;
import com.navin.service.BookService;

@RestController
@Controller
public class BookController {
	@Autowired
     BookService bs;
	@GetMapping("/book")
	List<Books> getAllBooksfromdatabase() {
		System.out.println("Control reached to controller");
		return bs.getAllBooks();
	}
	@GetMapping("/book/{id}")
	Books getOneBookFromDataBase(@PathVariable("id")int bid) {
		return bs.getBook(bid);
	}
	@PostMapping("/book")
	String insertBook(@RequestBody Books b) {
		return bs.insert(b);
	}
	@DeleteMapping("/book/{id}")
	String deleteBook(@PathVariable("id") int bid) {
		return bs.delete(bid);
	}
	@PutMapping("/book/{id}")
	String updateBook(@PathVariable("id")int bid,@RequestBody Books b) {
		return bs.update(bid,b);
	}
}