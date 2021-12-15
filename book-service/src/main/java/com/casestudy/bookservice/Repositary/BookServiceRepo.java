package com.casestudy.bookservice.Repositary;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.casestudy.bookservice.bean.Book;

public interface BookServiceRepo extends JpaRepository<Book, Integer> {	
	
	@Query(value ="select * from book where id = :bookId",nativeQuery = true)
	public Book getBookByUsingId(String bookId);
	
}
