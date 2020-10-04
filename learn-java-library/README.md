layout: page
title: "README"
permalink: /readme
# learn-java-library

# Maven
1. 当更改 pom.xml 中的 dependency 后，在 Intellij Idea 的 Terminal 中执行如下命令，可以重新下载所依赖的jar包：

    mvn clean install -U
    
2. 然后， Right click > Maven > Reload project （或者重新打开 IntelliJ Idea）

![Maven Reload Project](/assets/images/MavenReloadProject.png)

# Junit 5
在 pom.xml 中添加如下依赖：

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.7.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.7.0</version>
            <scope>test</scope>
        </dependency>

# poi
官网：http://poi.apache.org/index.html
在 pom.xml 中添加如下依赖：

        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>4.1.2</version>
        </dependency>

# guava
https://guava.dev/
https://github.com/google/guava/wiki
在 pom.xml 中添加如下依赖：

        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>28.0-jre</version>
        </dependency>

# Jackson
在 pom.xml 中添加如下依赖：

        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.11.2</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.11.2</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.11.2</version>
        </dependency>

        
# Fastjson
在 pom.xml 中添加如下依赖：

        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>1.2.73</version>
        </dependency>

# gson
在 pom.xml 中添加如下依赖：

        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.6</version>
        </dependency>

# logback
1. 首先在 pom.xml 中添加如下依赖：

        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-core</artifactId>
            <version>1.2.3</version>
        </dependency>
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.2.3</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.30</version>
        </dependency>
        
2. 然后在 Project Structure > Modules > Dependencies 中把 logback-classic.jar 添加至 classpath 中。
jar path 示例: add jar: C:\Users\fdu\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar

# lombok

* Plugin **Lombok** java library to **IntelliJ IDEA**
  * Go to **File > Settings > Plugins**
  * Click on **Marketplace**
  * Search **Lombok**
  * Click Install
  * Restart IntelliJ IDEA
  ![Install Lombok Plugin](assets/images/LombokPlugin.png?raw=true)

* 在 pom.xml 中添加如下依赖：

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.12</version>
            <scope>provided</scope>
        </dependency>

* Use Lombok annotation to write your classes
