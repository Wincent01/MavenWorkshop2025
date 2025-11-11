package org.workshop.maven;

import com.google.gson.Gson;
import org.workshop.common.CourseInfo;
import org.workshop.frontend.MyApplication;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    static void main(String[] args) {
        IO.println("Hello and welcome!");

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        Gson gson = new Gson();

        try (InputStream is = classloader.getResourceAsStream("data.json")) {
            assert is != null;

            String text = new String(is.readAllBytes(), StandardCharsets.UTF_8);

            CourseInfo info = gson.fromJson(text, CourseInfo.class);

            IO.println(info.getCourse());
            IO.println(info.getYear());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Launch JavaFX application
        MyApplication.launch(MyApplication.class, args);
    }
}
