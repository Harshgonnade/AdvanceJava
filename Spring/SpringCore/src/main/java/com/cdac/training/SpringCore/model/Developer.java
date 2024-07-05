package com.cdac.training.SpringCore.model;

//Setter Injection with dependent Object

//Pojo class with dependent Object of type Address - Loosely coupled class
public class Developer 
{
	private int id;
	private String name;
	private Address address; // has-a relationship - Address Object
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("********* Developer Info **************");
		System.out.println(id+" "+name);
		System.out.println(address);
	}
}
