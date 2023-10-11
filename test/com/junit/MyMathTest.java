package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath math = new MyMath();

	@Test
	void calculateSumOfThreeMemberArray() {
		// Absense of failure is success.
		// Test conditions or Assert
		
		// Writing test cases for MyMath function
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}

	@Test
	void calculateSumOfZeroMemberArray() {
		
		// Writing test cases for MyMath function
		assertEquals(0, math.calculateSum(new int[] {}));
	}
}
