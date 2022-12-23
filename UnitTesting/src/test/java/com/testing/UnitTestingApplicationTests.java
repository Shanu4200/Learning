package com.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestingApplicationTests {
	
	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		
		int expectedResult = 17;
		
		int actualResult = c.doSum(12,3,2);
		
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}

}
