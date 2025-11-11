package org.workshop.maven;

import org.workshop.common.CourseInfo;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    static void main(String[] args) {
        IO.println("Hello and welcome!");

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();


        try (InputStream is = classloader.getResourceAsStream("data.json")) {
            assert is != null;

            String text = new String(is.readAllBytes(), StandardCharsets.UTF_8);

            IO.println(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
