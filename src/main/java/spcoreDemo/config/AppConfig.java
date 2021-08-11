package spcoreDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spcoreDemo.models.Address;
import spcoreDemo.models.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public Address address() {
		
		Address adds=new Address();
		adds.setStreet("191, Barathi street");
		adds.setCity("Covai");
		adds.setPin("625586");
		
		return adds;
	}
	
	
	@Bean
	public Employee employee() {
		Employee emp=new Employee();
		return emp;
	}
	

}
