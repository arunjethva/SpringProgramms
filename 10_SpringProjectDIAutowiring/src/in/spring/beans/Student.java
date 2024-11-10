package in.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollNo;
	private String name;

	@Autowired // Automatically DI in address
	private Address address;

	@Autowired // Automatically DI in subjects obj in studnd obj
	private Subjects subjects;

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
	/*
	 * if we can't create getter and setter and than we can access bean object
	 * through DI by @Autowired but in real World project we create getter and
	 * setter.
	 */

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("RollNo : " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Subjects : " + subjects);
	}
}
