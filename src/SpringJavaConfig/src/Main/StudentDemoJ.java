package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringFDP.Student;
import springconfig.SpringConfigFile;

public class StudentDemoJ {

	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFile.class);
		 Student std =(Student) context.getBean("stdId");
		 std. display();

	}

}
