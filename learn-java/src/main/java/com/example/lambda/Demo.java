package com.example.lambda;

import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
//        verboseTestA();
        testB();
        testC();
//        customerTestA();
//        customerVerboseTestA();

    }

    private static void testA() {
        System.out.println("\nEnter testA");
        Arrays.asList("Foo", "Bar", "FOOD A", "food b", "Nice Bar").stream()
                .filter(s -> s.toLowerCase().contains("foo"))
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }

    private static void verboseTestA() {
        System.out.println("\nEnter verboseTestA");
        Arrays.asList("Foo", "Bar", "FOOD A", "food b", "Nice Bar").stream()
                .filter(s -> {
                    System.out.println("Filter: " + s);
                    return s.toLowerCase().contains("foo");
                })
                .map(s -> {
                    System.out.println("toUpperCase: " + s);
                    return s.toUpperCase();
                })
                .forEach(System.out::println);
    }

    private static void testB() {
        System.out.println("\nEnter testB");
        Arrays.stream(new String[]{"s1", "s2", "s3"})
                .map(s -> Arrays.asList(s))
                .flatMap(l -> l.stream())
                .forEach(System.out::println);
    }

    private static void testC() {
        System.out.println("\nEnter testC");
        Arrays.asList("s1", "s2", "s3").stream()
                .map(s -> Arrays.asList(s))
                //.flatMap(l -> l.stream())
                .forEach(System.out::println);
    }

    private static List<Customer> customerTestMain() {
        Customer feng = new Customer("Feng Du", 80);
        Customer helen = new Customer("Helen Guo", 100);
        Customer angela = new Customer("Angela Yu", 90);
        Customer clark = new Customer("Clark Xin", 70);
        return Arrays.asList(feng, helen, angela, clark);
    }

    private static void customerTestA() {
        System.out.println("\nEnter customerTestA");
        List<Customer> customers = customerTestMain();
        List<Customer> customersWithMoreThan80Points = customers.stream()
                .filter(c -> c.getPoints() > 80)
                //.map(c -> c.copyCustomer()) // 两个 map 都正确
                .map(Customer::copyCustomer)
                .collect(Collectors.toList());
        customersWithMoreThan80Points.forEach(System.out::println);
    }

    private static void customerVerboseTestA() {
        System.out.println("\nEnter customerVerboseTestA");
        List<Customer> customers = customerTestMain();
        List<Customer> customersWithMoreThan80Points = customers.stream()
                .filter(c -> {
                    System.out.println("Filter customer: " + c.getName());
                    return c.getPoints() > 80;
                })
                .map(c -> {
                    System.out.println("Map customer: " + c.getName());
                    return c.copyCustomer();
                })
                .collect(Collectors.toList());
        customersWithMoreThan80Points.forEach(c -> {
            System.out.println("Result. Customer: " + c.getName());
            System.out.println(c.toString());
        });
    }
}
