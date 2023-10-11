package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		// Absense of failure is success.
		// Test conditions or Assert
		
		// Writing test cases for MyMath function
		//1. Create instance of MyMath first.
		MyMath math = new MyMath();
		
		int[] numbers = {1,2,3};
		int result = math.calculateSum(numbers);
		System.out.println(result);
		
		int expectedResult = 5;
		assertEquals(expectedResult, result);
	}

}
