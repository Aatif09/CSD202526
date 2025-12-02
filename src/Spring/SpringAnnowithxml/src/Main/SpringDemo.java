package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringFDP.Student;

public class SpringDemo {

	public static void main(String[] args) {
		
		String path="/springcontext/applicationContext.xml";
		ApplicationContext context =new ClassPathXmlApplicationContext(path);
	 	Student s1=(Student) context.getBean("student");
		s1.display();
	}

}
