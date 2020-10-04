package com.example.annotation;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class JsonSerializerTest {
    private static JsonSerializer serializer;
    @BeforeAll
    static void setup() {
        System.out.println("Initialize JsonSerializer");
        serializer = new JsonSerializer();
    }

    @Test
    @DisplayName("Test Case 1")
    @EnabledOnOs({OS.WINDOWS})
    @Order(2)
    public void test1() throws JsonSerializationException {
        System.out.println("This is test case 1");
        Person person = new Person("soufiane", "cheouati", "34");
        String jsonString = serializer.serialize(person);
        Assertions.assertEquals(
                "{\"personAge\":\"34\",\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\"}",
                jsonString);
    }

    @Test
    @DisplayName("Test Case 2")
    @Order(1)
    public void test2() throws JsonSerializationException {
        System.out.println("This is test case 2");
        Person person1 = new Person("feng", "du", "33", "Dalian, China");
        String jsonString1 = serializer.serialize(person1);
        Assertions.assertEquals(
                "{\"personAge\":\"33\",\"firstName\":\"Feng\",\"lastName\":\"Du\"}",
                jsonString1
        );
    }

    @AfterAll
    static void tear() {
        System.out.println("This is the end");
    }
}