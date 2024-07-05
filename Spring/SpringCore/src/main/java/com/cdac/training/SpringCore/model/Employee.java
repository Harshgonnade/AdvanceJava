package com.cdac.training.SpringCore.model;

/**
 * Spring uses POJO Programming model - Constructor Dependency Injection
 * @author rajgs
 *
 */

public class Employee
{
	private int empId;
	private String name;
	private double salary;
	
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(" ************* Employee Details ************ ");
		System.out.println(this.empId+" "+this.name+" "+this.salary);
	}
}
