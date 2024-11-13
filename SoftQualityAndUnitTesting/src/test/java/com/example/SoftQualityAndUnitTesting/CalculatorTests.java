package com.example.SoftQualityAndUnitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void testAdd_Positive(){

        assertEquals(9.0, Calculator.add(4,5));

    }

    @Test
    void testAdd_Negative(){
        assertEquals(-4, Calculator.add(5, -9));
    }

    @Test
    void testSubtract_Positive() {
        assertEquals(1.0, calculator.subtract(3, 2));
    }

    @Test
    void testSubtract_Negative() {
        assertEquals(-5.0, calculator.subtract(-3, 2));
    }

    @Test
    void testMultiply_Positive() {
        assertEquals(6.0, Calculator.multiply(2, 3));
    }

    @Test
    void testMultiply_Negative() {
        assertEquals(-6.0, Calculator.multiply(-2, 3));
    }

    @Test
    void testDivide_Positive() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    void testDivide_ByZero() {
        assertTrue(Double.isInfinite(Calculator.divide(10, 0)));
    }

    @Test
    void testPower_Positive() {
        assertEquals(8.0, calculator.power(2, 3));
    }

    @Test
    void testPower_Negative() {
        assertEquals(0.5, calculator.power(2, -1));
    }

    @Test
    void testPower_NeutralElement() {
        assertEquals(1, calculator.power(24545, 0));
    }

    @Test
    void testPower_Zero() {
        assertEquals(0, calculator.power(0, 99599));
    }

    @Test
    void testPower_zeroToZero() {
        double result = Calculator.power(0, 0);
        assertEquals(1.0, result);
    }

}
