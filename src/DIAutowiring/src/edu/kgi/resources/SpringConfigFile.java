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
		Address addr =new Address();
		addr.setHouseno(100);
		addr.setCity("NCRGZB");
		addr.setPincode(201009);
		
		return addr;
			
		}
	@Bean
	public Student createStuObj() {
		Student st=new Student();
		
		st.setName("CSD");
		st.setRollno(105);
//		st.setAddress(createAddrObj());
		
		return st;
	}
	
}
