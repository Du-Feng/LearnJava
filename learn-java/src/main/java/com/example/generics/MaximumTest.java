package com.example.generics;

/**
 * https://www.tutorialspoint.com/java/java_generics.htm
 */
public class MaximumTest {
    public  static <T extends Comparable<T>> T Maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
