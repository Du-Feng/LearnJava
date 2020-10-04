package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * https://howtodoinjava.com/java/annotations/complete-java-annotations-tutorial/#using_custom_annotations
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JavaFileInfo {
    String author() default "unknown";
    String version() default "1.0";
    String[] reviewers() default {};
}
