package spcoreDemo.models;

import java.util.List;

public class Employee {
	private String name;
	private Address address;
	
	private List<String> skills;
	
	public Employee() {
	
	}
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		
//		this.address=new Address();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + this.address.toString() + ", skills=" + skills + "]";
	}

	
	
	

}
