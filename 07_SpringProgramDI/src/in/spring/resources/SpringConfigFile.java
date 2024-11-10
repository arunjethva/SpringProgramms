package in.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.beans.Address;
import in.spring.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddrObj() {

		Address addr = new Address();
		addr.setHouseNo(100);
		addr.setCity("rajkot");
		addr.setPincode(123852);

		return addr;

	}

	@Bean
	public Student createStudentObj() {
		Student std = new Student();
		std.setRollNo(5);
		std.setName("kd Jethva");
		std.setAddress(createAddrObj());
		return std;
	}

}
