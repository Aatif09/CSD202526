package edu.kgi.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.kgi.Beans.Student;

import org.springframework.context.ApplicationContext;

public class Main {
	public static void main(String[] args ) {
		String config_loc="/edu/kgi/resources/applicationContext.xml";
ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		
Student std=(Student)context.getBean("stdId");
std.display();
	}

}
