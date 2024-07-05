package com.cdac.training.springhibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String title;
	    private String author;
	    
		public Book() {
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
	    
	    


}
