package com.example.lombok;

import lombok.*;

/**
 * https://javabydeveloper.com/a-basic-java-lombok-maven-example-with-eclipse
 * https://www.baeldung.com/intro-to-project-lombok
 * https://www.geeksforgeeks.org/introduction-to-project-lombok-in-java-and-how-to-get-started/
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private Integer employeeId;
    private String name;
    private String company;
    private String emailId;
}
