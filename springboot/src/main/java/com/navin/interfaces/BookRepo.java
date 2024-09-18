package com.navin.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.navin.Entity.Books;
@Component
public interface BookRepo extends CrudRepository<Books,Integer> {
	Books findById(int bid);

}
