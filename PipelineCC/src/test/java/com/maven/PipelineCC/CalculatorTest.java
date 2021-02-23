package com.maven.PipelineCC;


import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
private Calculator objCalcUnderTest;

@Before
public void setUp() {
//Arrange
objCalcUnderTest = new Calculator();
}

@Test
public void testAdd() { 
int a = 15; int b = 20; 
int expectedResult = 35;
//Act 
long result = objCalcUnderTest.add(a, b);
//Assert
Assert.assertEquals(expectedResult, result);
}

@Test
public void testSubtract() {
int a = 25; int b = 20; 
int expectedResult = 5; 
long result = objCalcUnderTest.subtract(a, b);
Assert.assertEquals(expectedResult, result);
}
}