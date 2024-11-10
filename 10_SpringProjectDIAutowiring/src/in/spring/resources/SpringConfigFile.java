package in.spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.beans.Address;
import in.spring.beans.Student;
import in.spring.beans.Subjects;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseNo(21);
		addr.setCity("Gao");
		addr.setPincode(963258);

		return addr;

	}

	@Bean
	public Student createStdObj() {

		Student std = new Student();
		std.setRollNo(20);
		std.setName("kd gabber");
//		std.setSubjects(createSbjObj());//its manually DI

		return std;

	}

	@Bean
	public Subjects createSbjObj() {
		Subjects subjects = new Subjects();

		List<String> subjects_list = new ArrayList<>();

		subjects_list.add("java");
		subjects_list.add("python");
		subjects_list.add("react");

		subjects.setSubjects(subjects_list);

		return subjects;
	}
}
