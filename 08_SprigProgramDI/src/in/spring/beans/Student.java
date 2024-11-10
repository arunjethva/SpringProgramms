package in.spring.beans;

public class Student {

	public int rollNo;
	public String name;
	private Address address;

	public Student(int rollNo, String name, Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;

	}

	public void display() {
		System.out.println("RollNo: " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Address " + address);
	}
}
