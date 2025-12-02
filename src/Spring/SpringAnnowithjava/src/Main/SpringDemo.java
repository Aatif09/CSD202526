package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import SpringFDP.Student;
import springcontext.SpringConfigFIle;

public class SpringDemo {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFIle.class);
	 	Student s1=(Student) context.getBean("student");
		s1.display();
	}

}
