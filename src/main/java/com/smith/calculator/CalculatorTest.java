package com.smith.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum(){
		org.junit.Assert.assertEquals(5,calculator.sum(2,3));
	}
}