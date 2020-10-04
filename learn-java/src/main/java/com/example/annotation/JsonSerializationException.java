package com.example.annotation;

/**
 * https://www.baeldung.com/java-custom-annotation
 */
public class JsonSerializationException extends Exception {
    public JsonSerializationException(String message) {
        super(message);
    }
}
