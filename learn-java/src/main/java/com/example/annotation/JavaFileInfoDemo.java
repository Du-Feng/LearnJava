package com.example.annotation;

import com.example.annotation.JavaFileInfo;

@JavaFileInfo
public class JavaFileInfoDemo {
    @JavaFileInfo(author = "Feng Du", version = "1.0", reviewers = {"Feng Du", "Jing Gong"})
    public String getString() {
        return "";
    }
}
