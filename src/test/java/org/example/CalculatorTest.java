/********************StudentID:B201202031***************
*********************Name:Gulnihal**********************
*********************Surname:COSKUN*********************
*********************Course Name:SWE202 SOFTWARE VERIFICATION AND VALIDATION
*********************Assignment1*************************
 ********************GitHub Repository address: https://github.com/gulnihalcoskunn/Assignment1.git */


package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 5, 2.5",
            "10, 2.5, 4",
            "12.5, 2.5, 5"
    })
    public void testDivision(double dividend, double divisor, double expected) {
        assertEquals(expected, Calculator.divide(dividend, divisor));
    }

    @Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );
    }
}
