package org.workshop.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseInfoTest {

    @Test
    void getCourse() {
        var course = new CourseInfo();

        course.setCourse("TDA123");

        assertEquals("TDA123", course.getCourse());
    }

    @Test
    void getYear() {
        var course = new CourseInfo();

        course.setYear(42);

        assertEquals(42, course.getYear());
    }
}