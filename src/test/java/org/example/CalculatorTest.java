package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        assertEquals(8,calc.add(4,4));
    }

    @Test
    public void testMultiply(){
        Calculator calc = new Calculator();
        assertEquals(16,calc.multiply(4,4));
    }

    @Test
    public void testDivide(){
        Calculator calc = new Calculator();
        assertEquals(2.0,calc.divide(8,4));
    }
}