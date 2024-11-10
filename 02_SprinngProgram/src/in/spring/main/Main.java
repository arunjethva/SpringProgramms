package in.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.spring.beans.Student;
import in.spring.resource.SpringConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//	Student std=(Student)context.getBean("stdId1");
//	std.display();

		// another way to display

		Student std1 = (Student) context.getBean(Student.class);
		std1.display();
	}
}
