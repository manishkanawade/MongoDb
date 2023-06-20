package com.wipro.test.service;

import java.util.List;

import com.wipro.test.entity.Book;

public interface BookService {
	
	public Book saveBook(Book book);
	
	public List<Book> getBook();
	
	public Book updateBook(Book book);
	
	public String deleteBook(Book bookId);

}
