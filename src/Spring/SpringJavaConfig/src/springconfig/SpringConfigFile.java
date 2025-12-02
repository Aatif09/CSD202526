package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringFDP.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Student stdId() {
		Student s1=new Student();
		s1.setName("AJ");
		s1.setRollno(11);
		s1.setAddress("Local Ghzb");
		
		return s1;

}
}
