package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DemoApplicationTests {

	Calculator calculator = new Calculator();
	@Test
	void itShouldAddTwoNumbers() throws Exception {
		//given
		int numberOne = 20;
		int numberTwo = 30;
		//when
		int result = calculator.add(numberOne, numberTwo);
		//then
		assertThat(result).isEqualTo(50);
	}

	class Calculator {
		int add(int a, int b){
			return a + b;
		}
	}
}
