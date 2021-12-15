package com.casestudy.subscriptionservice.Repositary;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.casestudy.subscriptionservice.bean.Book;


@FeignClient(name = "book-service", url= "localhost:8090")
public interface OpenFeignProxy {
	
	@GetMapping("/book-service/books/{bookId}")
	public Book getBookById(@PathVariable String bookId) ;
}
