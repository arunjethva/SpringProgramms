package in.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class Main {

	public static void main(String[] args) {
		String Cogfil_file_loc = "/in/spring/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(Cogfil_file_loc);
		Student std = (Student) context.getBean("stdId");
		std.display();
	}
}
