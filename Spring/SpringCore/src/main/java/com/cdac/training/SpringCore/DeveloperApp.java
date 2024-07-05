package com.cdac.training.SpringCore;

import com.cdac.training.SpringCore.model.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperApp 
{
	public static void main(String[] args) {

		 ApplicationContext context =new ClassPathXmlApplicationContext("DeveloperConfig.xml");
		 
		 Developer d1=(Developer)context.getBean("developer1");
		 
		 d1.displayInfo();
		 
		 ((ClassPathXmlApplicationContext) context).close();

	}
}
