package com.example.generics;

/**
 * https://www.geeksforgeeks.org/generics-in-java/
 *
 * @param <T>
 * @param <U>
 */
public class GenericClassDemo2 <T, U> {
    private T obj1;
    private U obj2;

    public T getObj1() {
        return obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public GenericClassDemo2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
}
