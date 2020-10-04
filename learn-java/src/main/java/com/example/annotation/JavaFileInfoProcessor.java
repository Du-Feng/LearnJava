package com.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class JavaFileInfoProcessor {
    public static void readAnnotation(AnnotatedElement element) {
        try {
            System.out.println("\nFinding annotation on " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if(annotation instanceof JavaFileInfo) {
                    JavaFileInfo fileInfo = (JavaFileInfo)annotation;
                    System.out.println("Author: " + fileInfo.author());
                    System.out.println("Version: " + fileInfo.version());
                    System.out.println("Reviewers: " + String.join(" | ", fileInfo.reviewers()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
