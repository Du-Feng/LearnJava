package com.example.generics;

/**
 * https://www.geeksforgeeks.org/generics-in-java/
 *
 * @param <T>
 */
public class GenericClassDemo <T> {
    private T data;

    public T getData() {
        return data;
    }

    public GenericClassDemo(T data) {
        this.data = data;
    }
}

