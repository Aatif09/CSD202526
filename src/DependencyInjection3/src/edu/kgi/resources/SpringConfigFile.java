package edu.kgi.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.kgi.Beans.Address;
import edu.kgi.Beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj()
	
		{
		Address addr =new Address(11,"GHZB",12211);
		
		return addr;
			
		}
	@Bean
	public Student createStuObj() {
		Student st=new Student("AJ",121,createAddrObj());
		
			
		return st;
	}
	
}
