package com.cdac.training.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.training.SpringCore.model.Student;

/**
 * Hello world!
 *
 */
public class StudentApp 
{
    public static void main( String[] args )
    {
    	System.out.println( "Spring IOC approach for Creation of Objects -Setter Injection ******* " );

		// Central Interface to provide configuration for Spring Application.
		// It is responsible for instantiating, wiring,configuring & managing life cycle of Objects
		// Implements Spring IOC
		ApplicationContext appContext= new ClassPathXmlApplicationContext("StudentConfig.xml");

			Student s1=(Student)appContext.getBean("stud1");
			Student s2=(Student)appContext.getBean("stud2");
	
			System.out.println("*********** Student Details **************");
			System.out.println(s1.getRollNo()+" "+s1.getName()+" "+s1.getCollege()+" "+s1.getMarks());
			System.out.println(s2.getRollNo()+" "+s2.getName()+" "+s2.getCollege()+" "+s2.getMarks());

		((ClassPathXmlApplicationContext) appContext).close();
    }
}
