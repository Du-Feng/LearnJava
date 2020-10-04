package com.example.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericClassDemoTest {

    @Test
    void getData() {
        Integer number = 4;
        GenericClassDemo<Integer> inputIntData = new GenericClassDemo<>(4);
        Assertions.assertEquals(number, inputIntData.getData());
        Assertions.assertEquals(number.getClass(), inputIntData.getData().getClass());

        String message = "Hello World!";
        GenericClassDemo<String> inputStringData = new GenericClassDemo<>(message);
        Assertions.assertEquals(message, inputStringData.getData());
        Assertions.assertEquals(message.getClass(), inputStringData.getData().getClass());
    }
}