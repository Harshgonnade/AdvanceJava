package com.cdac.training.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.training.SpringCore.model.Book;

public class BookApp
{
	public static void main(String[] args) {
		System.out.println( "****** Spring IOC approach for Creation of Objects ******* " );
        
        // Central Interface to provide configuration for Spring Application.
        // It is responsible for instantiating, wiring,configuring & managing life cycle of Objects
        // Implements Spring IOC
        ApplicationContext context =new ClassPathXmlApplicationContext("BookConfig.xml");
        
        Book b1=(Book)context.getBean("book1");
        
        b1.display();
        
        ((ClassPathXmlApplicationContext) context).close();
	}
}
