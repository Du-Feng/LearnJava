package com.example.poi;

import org.junit.jupiter.api.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExcelDemoTest {
    private static ExcelDemo demo;
    private static String containerPath;

    @BeforeAll
    static void setUp() {
        //System.out.println("File.separator: " + File.separator);
        containerPath = System.getProperty("user.dir");
        demo = new ExcelDemo();
    }

    @AfterAll
    static void tearDown() {
    }

    @Test
    void readExcel() {
        String fileLocation = containerPath + "\\src\\test\\resources\\Source.xlsx";
        System.out.println("Read excel: " + fileLocation);
        demo.ReadExcel(fileLocation);
    }

    @Test
    void writeExcel() {
//        File currDir = new File(".");
//        String path = currDir.getAbsolutePath();
//        String fileLocation = path.substring(0, path.length() - 1) + "output\\temp.xlsx";

        String fileLocation = containerPath + "\\src\\test\\output\\temp.xlsx";
        System.out.println(String.format("Excel path: %s", fileLocation));
        demo.WriteExcel(fileLocation);
        System.out.println("Write excel: " + fileLocation);
    }

    @Test
    void writeExcel2() {
        String fileLocation = containerPath + "\\src\\test\\output\\temp2.xlsx";
        System.out.println(String.format("Excel path: %s", fileLocation));
        List<Object[]> data = new ArrayList();
        data.add(new Object[]{"Emp No.", "Name", "Salary", "ID"});
        data.add(new Object[]{1d, "John", 1500000d, "=A2&B2"});
        data.add(new Object[]{2d, "Sam", 800000d, "=A3&B3"});
        data.add(new Object[]{3d, "Dean", 700000d, "=A4&B4"});
        demo.WriteExcel(fileLocation, "Sheet 1", data);
        System.out.println("Write excel: " + fileLocation);
    }
}