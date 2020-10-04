package com.example.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericMethodDemoTest {

    @Test
    void genericDisplay() {
        GenericMethodDemo.genericDisplay(11);
        GenericMethodDemo.genericDisplay("Hello world!");
        GenericMethodDemo.genericDisplay(1.1234);
    }
}