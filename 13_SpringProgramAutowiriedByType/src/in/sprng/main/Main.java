package in.sprng.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/spring/resources/applicationContext.xml");

		Student std = (Student) context.getBean("stdId");
		std.display();
	}

}
