package com.example.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {

    @Test
    void addsTwoPositiveNumbers() {
        assertEquals(5, Adder.add(2, 3));
    }

    @Test
    void addsPositiveAndNegativeNumbers() {
        assertEquals(2, Adder.add(5, -3));
    }

    @Test
    void addsTwoNegativeNumbers() {
        assertEquals(-8, Adder.add(-5, -3));
    }

    @Test
    void security_negativeInputIsHandledAsNumericData() {
        int result = Adder.add(-10, 5);

        assertEquals(-5, result);
    }
}
