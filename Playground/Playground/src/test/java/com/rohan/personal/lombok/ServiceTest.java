package com.rohan.personal.lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class ServiceTest {

	Bean man;
	Service service;
	
	@BeforeAll 
	void initialize() {
		man = new Bean();
		service = new Service();
	}
	
	@Test
	void testSetValues() {		
		Bean manResult = service.setValues(man);
		
		String testName = "Rohan";
		int testAge = 24;
		String testToString = "Bean(name=Rohan, age=24)";
		
		assertEquals(manResult.getName(), testName);
		assertEquals(manResult.getAge(), testAge);
		assertEquals(manResult.toString(), testToString);
	}
	
	@Test
	void testIsAdult() {
		Bean manResult = service.setValues(man);		
		assertTrue(service.isAdult(manResult));
		
		man.setAge(16);
		assertFalse(service.isAdult(man));
	}
}
