package calculator;

import calculator.calculators.Calculator;
import calculator.exceptions.DivideBy0Exception;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void floatAdd() {
        assertEquals(3, Calculator.floatAdd(1,2));
    }

    @Test
    void floatSubtract() {
        assertEquals(0, Calculator.floatSubtract(3, 3));
        assertEquals(4, Calculator.floatSubtract(10, 6));
        assertEquals(-10, Calculator.floatSubtract(0, 10));
    }

    @Test
    void floatDivide() {
                assertThrows(DivideBy0Exception.class,()-> {
                    Calculator.floatDivide(1,0);
                });
        assertEquals(1, Calculator.floatDivide(2, 2));
    }

    @Test
    void floatMultiply() {
        assertEquals(1, Calculator.floatMultiply(1, 1));
        assertEquals(0, Calculator.floatMultiply(1, 0));
        assertEquals(0, Calculator.floatMultiply(0, 1));
        assertEquals(10, Calculator.floatMultiply(5, 2));
        assertEquals(10, Calculator.floatMultiply(2, 5));
    }
}