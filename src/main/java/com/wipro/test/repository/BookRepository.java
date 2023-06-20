package com.wipro.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.test.entity.Book;
@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

}
