package com.casestudy.bookservice.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.bookservice.bean.Book;
import com.casestudy.bookservice.service.BookService;

@RestController
@RequestMapping("/")
public class BookServiceController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book-service/books")
	public List <Book> getBooks() {
		return bookService.getAllBooks();
	
	}
	
	@GetMapping("/book-service/books/{bookid}")
	public Book getBooks(@PathVariable String bookid) {
		return bookService.getBook(bookid);
	
	}
	
	@PostMapping(value ="/book-service/books",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Book> addBook(@RequestBody Book book) throws Exception{		
		Book bookadded = bookService.addBook(book);
		    if (bookadded == null) {
		        throw new Exception();
		    } else {
		        return new ResponseEntity<Book>(bookadded, HttpStatus.CREATED);
		    }
	}
	
	
}
