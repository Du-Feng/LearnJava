package com.example.gson;

import com.google.gson.Gson;

public class GsonDemo {
    public static void main(String[] args) {
        Book book = new Book("Thinking in Java", "978-0131872486", 1998, new String[]{"Bruce Eckel"});
        Gson gson = new Gson();
        String json = gson.toJson(book);
        System.out.println("JSON String: " + json);

        Book jsonObject = gson.fromJson(json, Book.class);
        System.out.println("Book Object Object: " + jsonObject.toString());
    }
}
