package edu.esprit.ci.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GreeterTest {

	Greeter greeter;
	
	@Before
	public void setUp() throws Exception {
		
		greeter = new Greeter();
	}

	@Test
	public void test1() {
		
		assertEquals("Hello Kais", greeter.sayHello("Kais"));
		
	}
	
	@Test
	public void test2() {
		
		assertEquals("GoodBye Kais", greeter.sayGoodBye("Kais"));
		
	}
	

}
