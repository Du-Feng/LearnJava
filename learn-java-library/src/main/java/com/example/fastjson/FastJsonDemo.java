package com.example.fastjson;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class FastJsonDemo {
    public static void main(String[] args) {
        Book book = new Book("Thinking in Java", "978-0131872486", 1998, new String[]{"Bruce Eckel"});
        String json = JSON.toJSONString(book);
        System.out.println("JSON String: " + json);

        Book jsonObject = JSON.parseObject(json, Book.class);
        System.out.println("Book Object: " + jsonObject.toString());
    }
}
