package in.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollNo;
	private String name;
	
	@Autowired//its make dependency injection automatically if not creat getter and settert than its not needed 
	private Address address;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Rollno : " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
