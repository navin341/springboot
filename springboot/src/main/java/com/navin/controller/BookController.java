package com.navin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navin.Entity.Books;
import com.navin.service.BookService;

@RestController
@Controller
public class BookController {
	@Autowired
     BookService bs;
	@GetMapping("/getAllBooks")
	List<Books> getAllBooksfromdatabase() {
		System.out.println("Control reached to controller");
		return bs.getAllBooks();
	}
	@GetMapping("/getBookOnId/{id}")
	Books getBooksFromDatabase(@PathVariable("id")int bid){
		return bs.getBook(bid);
	}
}
