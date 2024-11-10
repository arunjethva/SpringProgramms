package in.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.spring.beans.Studunt;
import in.spring.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Studunt std = (Studunt) context.getBean(Studunt.class);
		std.display();
	}
}
