package in.spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.beans.Address;
import in.spring.beans.Studunt;
import in.spring.beans.Subjects;

@Configuration
public class SpringConfigFile {

	@Bean
	public Studunt createStdObj() {
		Studunt std1 = new Studunt();

		std1.setName("Strom");
		std1.setRollNo(15);

		return std1;
	}

	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseNo(33);
		addr.setCity("Pune");
		addr.setPincode(573916);
		return addr;
	}

	/*
	 * if want to provide a name to bean than if simply provide in () after @bean
	 * Annotation and we call with new bean name in during @qulifer annotation
	 */
	@Bean("addr2")
	public Address createAddrObj2() {
		Address addr = new Address();
		addr.setHouseNo(38);
		addr.setCity("Daman");
		addr.setPincode(689916);
		return addr;
	}

	@Bean
	public Subjects createSbjObj() {
		Subjects sbjs = new Subjects();
		List<String> subjects_lists = new ArrayList<>();
		subjects_lists.add("JAVA");
		subjects_lists.add("REACT");
		subjects_lists.add("C++");

		sbjs.setSubjects(subjects_lists);
		return sbjs;
	}

	@Bean
	public Subjects createSbjObj2() {
		Subjects sbjs = new Subjects();
		List<String> subjects_lists = new ArrayList<>();
		subjects_lists.add("HTML");
		subjects_lists.add("CSS");
		subjects_lists.add("JAVASCRIPT");

		sbjs.setSubjects(subjects_lists);
		return sbjs;
	}
}
