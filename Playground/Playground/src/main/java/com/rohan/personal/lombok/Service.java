package com.rohan.personal.lombok;

public class Service {
	
	public Bean setValues(Bean man) {
		String name = "Rohan";
		int age = 24;
		
		man.setName(name);
		man.setAge(age);
		
		return man;
	}

	public boolean isAdult(Bean man) {
		return (man.getAge()>=18)? true: false;
	}
}
