package com.example.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GenericClassDemo2Test {
    @Test
    @DisplayName("This is the test suite")
    void testSuite() {
        String message = "Hello world!";
        Integer number = 888;
        GenericClassDemo2<String, Integer> input = new GenericClassDemo2(message, number);
        Assertions.assertEquals(message, input.getObj1());
        Assertions.assertEquals(message.getClass(), input.getObj1().getClass());
        Assertions.assertEquals(number, input.getObj2());
        Assertions.assertEquals(number.getClass(), input.getObj2().getClass());
    }
}