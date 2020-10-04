package com.example.generics;

/**
 * https://www.geeksforgeeks.org/generics-in-java/
 *
 */
public class GenericMethodDemo {
    /**
     * https://www.geeksforgeeks.org/generics-in-java/
     * @param element
     * @param <T>
     */
    public static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
