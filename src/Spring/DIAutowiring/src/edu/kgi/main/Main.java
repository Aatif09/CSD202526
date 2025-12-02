package edu.kgi.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.kgi.Beans.Student;
import edu.kgi.resources.SpringConfigFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args ) {
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFile.class);
		 Student std =context.getBean(Student.class);
		 std. display();
	}

}
