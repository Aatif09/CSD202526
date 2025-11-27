package SpringFDP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("22")
	private int rollno;
	@Value("AAATTT")
	private String name;
	@Value("AAew Delhi")
	private String address;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Roll="+rollno);
		System.out.println("Name="+name);
		System.out.println("Address="+address);	
	}
}
//https://mvnrepository.com/search?q=
//https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html
