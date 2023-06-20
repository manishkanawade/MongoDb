package com.wipro.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.test.entity.Book;
import com.wipro.test.repository.BookRepository;
import com.wipro.test.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {

		return this.bookRepository.insert(book);
	}

	@Override
	public String deleteBook(Book bookId) {
		this.bookRepository.delete(bookId);
		return "book deleted successfully";
	}

	@Override
	public List<Book> getBook() {
		
		return this.bookRepository.findAll();
	}

	@Override
	public Book updateBook(Book book) {
		
		return this.bookRepository.save(book);
	}

}
