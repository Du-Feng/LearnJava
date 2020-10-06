package com.example.lombok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeTester {
    public static void main(String[] args) {
        testA();
        testB();
        complexTest();
    }

    private static void testA() {
        log.info("\nThis is testA");
        Employee employee = new Employee();
        employee.setName("Feng Du");
        employee.setCompany("Jedi");
        employee.setEmail("feng.du@outlook.com");
        employee.setEmployeeId(1);
        log.info(employee.toString());
    }

    private static void testB() {
        log.info("\nThis is testB");
        Employee employee = new Employee(2, "Gong Jing", "Jedi", "huhuhetutu@yean.net");
        log.info(employee.toString());
    }

    private static void complexTest() {
        log.info("\nThis is complex test");
        ComplexEmployee employee = ComplexEmployee.builder()
                .employeeId(3)
                .name("Gong Hu")
                .company("Jedi")
                .email("")
                .build();
        log.info(employee.toString());
    }
}
