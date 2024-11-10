package in.spring.beans;

public class Student {

	// Create dependency injection with setter method by java config-classs
	private int rollNo;
	private String name;
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
		System.out.println("RollNo : " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);

	}

}
