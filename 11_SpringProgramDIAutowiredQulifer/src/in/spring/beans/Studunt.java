package in.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Studunt {

	private String name;
	private int rollNo;
	@Autowired
	@Qualifier("addr2")
	private Address address;

	@Autowired
	@Qualifier("createSbjObj2")
	private Subjects subjects;

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("rollno : " + rollNo);
		System.out.println("Address : " + address);
		System.out.println("Subjects : " + subjects);
	}
}
