package in.spring.beans;

public class Student {

	// dependency injection though a constructor

	private String name;
	private int rollNo;
	private Address address;

	public Student(String name, int rollNo, Address address) {
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;

	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("RollNo : " + rollNo);
		System.out.println("Address : " + address);

	}

}
