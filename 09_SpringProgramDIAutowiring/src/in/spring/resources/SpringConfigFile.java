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

		addr.setHouseNo(2);
		addr.setCity("ahemdabad");
		addr.setPincode(5252);
		return addr;
	}

	@Bean
	public Student createStdObj() {
		Student std = new Student();

		std.setRollNo(53);
		std.setName("jay");
		// std.setAddress(createAddrObj());//Manully Dependency injectiom
		return std;
	}

}
