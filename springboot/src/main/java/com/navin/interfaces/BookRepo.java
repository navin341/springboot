package com.navin.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.navin.Entity.Books;
//@Component
@Repository
public interface BookRepo extends CrudRepository<Books,Integer> {
	Books findById(int bid);

}
