package in.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.beans.Address;
import in.spring.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddrObj() {
		Address addr = new Address(100, "newYork", 966996);

		return addr;

	}

	@Bean
	public Student createStdOnbj() {
		Student std = new Student(54, "Aj jethva", createAddrObj());
		return std;
	}
}
