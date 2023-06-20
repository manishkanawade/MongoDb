package com.wipro.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.test.entity.Book;
import com.wipro.test.serviceImpl.BookServiceImpl;

@RestController
public class BookController {
	
	@Autowired
	BookServiceImpl bookServiceImpl;

	@PostMapping("/book")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		Book b=this.bookServiceImpl.saveBook(book);
		return new ResponseEntity<>(b , HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getBook(){
		List<Book> b=this.bookServiceImpl.getBook();
		return new ResponseEntity<List<Book>>(b, HttpStatus.ACCEPTED);
		
	}
	
	
	@PutMapping("/book") 
	ResponseEntity<Book> updateBook(@RequestBody Book book){
		Book b=this.bookServiceImpl.updateBook(book);
		return new ResponseEntity<Book>(b, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteBook")
	public ResponseEntity<String> deleteBook(@RequestParam Book bookId){
		String s=this.bookServiceImpl.deleteBook(bookId);
		return new ResponseEntity<String>(s, HttpStatus.GONE);
	}
}
