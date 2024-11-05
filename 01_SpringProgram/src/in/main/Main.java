package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_Ioc="in/spring/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_Ioc);
		
		Student std1 =(Student) context.getBean("stdId1");
		std1.display();
		
		Student std2=(Student)context.getBean("stdId2");
		std2.display();
	}
}
