package com.navin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.navin.Entity.Books;
import com.navin.service.BookService;

@RestController
public class BookController {
	@Autowired
     BookService bs;
	@GetMapping("/getAllBooks")
	public List<Books> getAllBooksfromdatabase() {
		return bs.getAllBooks();
	}
	@GetMapping("/getBookOnId/{id}")
	Books getBooksFromDatabase(@PathVariable("id")int bid){
		return bs.getBook(bid);
	}
}
