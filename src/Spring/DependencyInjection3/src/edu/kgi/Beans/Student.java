package edu.kgi.Beans;

public class Student {
	
	private String name;
	private int rollno;
	private Address address;
	
	public Student(String name ,int rollno,Address address) {
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}


	public void display() {
		System.out.println("Nae="+name);
		System.out.println("Rollno="+rollno);
		System.out.println("Address="+address);
		
	}

}
