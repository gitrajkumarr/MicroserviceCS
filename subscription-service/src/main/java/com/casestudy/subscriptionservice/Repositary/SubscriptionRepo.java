package com.casestudy.subscriptionservice.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.casestudy.subscriptionservice.bean.Book;
import com.casestudy.subscriptionservice.bean.Subscription;

public interface SubscriptionRepo extends JpaRepository<Subscription, Integer> {
	
	@Query(value ="update book set available_Copies = :count where id = :bookId",nativeQuery = true)
	public int updateAvailableCopies(int count,String bookId);
	
	@Query(value ="select available_Copies from book where id = :bookId",nativeQuery = true)
	public int getAvailableCopies(String bookId);

}
