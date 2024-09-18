 package com.navin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.navin.Entity.Books;
import com.navin.interfaces.BookRepo;
@Component
public class BookService {
	@Autowired
	BookRepo br;

	public List<Books> getAllBooks() {
		return (List<Books>) br.findAll();
	}

	public Books getBook(int bid) {
		return br.findById(bid);
	}

}
