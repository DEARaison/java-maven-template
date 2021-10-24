package com.github.dearaison.template;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by IntelliJ on Sunday, 20 September, 2020 at 11:22.
 *
 * @author Joseph Maria
 */
public class CalculatorTest {
    @Test
    public void getVersion() throws IOException {
        String version = Calculator.getVersion();
        assertEquals("1.0.0-SNAPSHOT", version);
        System.out.println("Current version: " + version);
    }

    @Test
    public void addsTwoNumbers() {
        Calculator calculator = new Calculator(1, 1);
        assertEquals(2, calculator.sumOfTwoNumbers());
    }
}
