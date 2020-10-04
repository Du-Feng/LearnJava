package com.example.annotation;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

public class JavaFileInfoTest {
    @Test
    void annotationTest() throws NoSuchMethodException, SecurityException {
        JavaFileInfoDemo demo = new JavaFileInfoDemo();

        Class<JavaFileInfoDemo> demoClassObj = JavaFileInfoDemo.class;
        JavaFileInfoProcessor.readAnnotation(demoClassObj);

        Method method = demoClassObj.getMethod("getString", new Class[]{});
        JavaFileInfoProcessor.readAnnotation(method);
    }
}
