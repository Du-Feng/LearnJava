package com.example.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {

    @Test
    void testMyList() {
        String[] myStringArray = new String[]{"abc", "mno", "pqr", "xyz"};
        MyList<String> myList = new MyList<String>();
        for(String myString : myStringArray) {
            myList.add(myString);
        }

        int count = 0;
        for (String myString : myList) {
            System.out.println(myString);
            Assertions.assertEquals(myStringArray[count], myString);
            count++;
        }
        Assertions.assertEquals(myStringArray.length, count);
    }
}