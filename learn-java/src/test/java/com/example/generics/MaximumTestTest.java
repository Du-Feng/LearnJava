package com.example.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTestTest {

    @Test
    void maximum() {
        System.out.printf("Max of %d, %d, %d is %d\n\n", 3, 4, 5, MaximumTest.Maximum(3, 4, 5));
        System.out.printf("Max of %.1f, %.1f, %.1f is %.1f\n\n", 6.6, 7.7, 9.9, MaximumTest.Maximum(6.6, 7.7, 9.9));
        System.out.printf("Max of %s, %s, %s is %s\n", "pear", "apple", "orange", MaximumTest.Maximum("pear", "apple", "orange"));
    }
}