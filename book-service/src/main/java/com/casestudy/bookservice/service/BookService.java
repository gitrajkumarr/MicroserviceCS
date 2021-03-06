package com.casestudy.bookservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.bookservice.Repositary.BookServiceRepo;
import com.casestudy.bookservice.bean.Book;

@Service
@Transactional
public class BookService {
	@Autowired
	private BookServiceRepo repo;
	
	public List<Book> getAllBooks() {
		return repo.findAll();
		
	}
	public Book addBook(Book book) {
		return repo.save(book);		
	}
	public Book getBook(String bookid) {
		return repo.getBookByUsingId(bookid);
	}
}
