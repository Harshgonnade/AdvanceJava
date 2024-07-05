package com.cdac.training.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.training.SpringCore.model.Employee;

public class EmployeeApp 
{
	public static void main(String[] args) {
		
		 // Central Interface to provide configuration for Spring Application.
       // It is responsible for instantiating, wiring,configuring & managing life cycle of Objects
       // Implements Spring IOC
       ApplicationContext context =new ClassPathXmlApplicationContext("EmployeeConfig.xml");
       
       //Get the Employee Bean
       Employee e = (Employee)context.getBean("emp1");
       
       // Invoke method inside main method
       e.display();
       
       
       Employee e2 = (Employee)context.getBean("emp2");
       e2.display();
       
       ((ClassPathXmlApplicationContext) context).close();

	}
}
