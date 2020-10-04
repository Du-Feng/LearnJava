package com.example.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * https://attacomsian.com/blog/jackson-read-write-json
 * https://www.cnblogs.com/30go/p/8929898.html
 */
public class JacksonDemo {
    public static void main(String[] args) {
        try {
            Book book = new Book("Thinking in Java", "978-0131872486", 1998, new String[]{"Bruce Eckel"});
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(book);
            System.out.println("JSON String: " + json);

            Book jsonObject = mapper.readValue(json, Book.class);
            System.out.println("Book: " + jsonObject.toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
