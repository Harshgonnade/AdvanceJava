package com.cdac.training.SpringCore.model;

public class Book 
{
	private int id;  
	private String name,author,publisher;  
	private int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	public void display()
	{
		
		System.out.println(id +" "+name+" "+author+" "+publisher+" "+quantity);
	}
}
