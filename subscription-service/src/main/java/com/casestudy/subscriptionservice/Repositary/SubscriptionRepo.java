package com.casestudy.subscriptionservice.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.casestudy.subscriptionservice.bean.Subscription;

public interface SubscriptionRepo extends JpaRepository<Subscription, Integer> {
	
	@Modifying
	@Query(value ="update book set Available_Copies = :count where id = :bookId",nativeQuery = true)
	public int updateAvailableCopies(int count,String bookId);
	
	
	@Query(value ="select available_Copies from book where id = :bookId",nativeQuery = true)
	public int getAvailableCopies(String bookId);

}
