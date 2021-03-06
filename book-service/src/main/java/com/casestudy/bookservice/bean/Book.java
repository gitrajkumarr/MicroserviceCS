package com.casestudy.bookservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Book {
	
	@Id
	@Column(name = "id")
	private String id ;
	
	@Column(name="Book_Name")
    private String name;
	
	@Column(name="Author")
    private String author;
	
	@Column(name="Available_Copies")
    private int numcopiesAvailable ;
	
	@Column(name="Total_Copies")
    private int totalCopies ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumcopiesAvailable() {
		return numcopiesAvailable;
	}

	public void setNumcopiesAvailable(int numcopiesAvailable) {
		this.numcopiesAvailable = numcopiesAvailable;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}
    
    

}
