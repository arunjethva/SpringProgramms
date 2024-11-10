package in.spring.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.beans.Student;

@Configuration
public class SpringConfig {

	@Bean
	public Student stdId1() {
		Student std = new Student();
		std.setName("abc");
		std.setRollNo(01);
		std.setEmail("abc@gmail.com");
		return std;
		
	}
}
