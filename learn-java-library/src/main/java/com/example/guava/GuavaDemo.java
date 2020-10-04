package com.example.guava;

import com.google.common.base.Optional;

public class GuavaDemo {
    public static void main(String[] args) {
        Optional<Integer> possible = Optional.of(5);
        if (possible.isPresent()) {
            System.out.println("possible: " + possible.get());
        } else {
            System.out.println("possible is absent");
        }
    }
}
