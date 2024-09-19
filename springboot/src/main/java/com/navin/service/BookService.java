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

	public String insert(Books b) {
		br.save(b);
		return "success";
	}

	public String delete(int bid) {
		Books b=br.findById(bid);
		br.delete(b);
		return "deleted";
	}

	public String update(int bid,Books b) {
		if(br.findById(bid)!=null) {
			br.save(b);
			return "updated";
		}
		else{
			return "not Updated";
		}
	}

}
