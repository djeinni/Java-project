package com.pluralsight.courseinfo.cli.service;

import com.pluralsight.courseinfo.repository.CourseJdbcRepository;
import com.pluralsight.courseinfo.repository.CourseRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseStorageServiceTest {

    @Test
    void storePluralSightCourses() {
        CourseRepository repository = new CourseJdbcRepository("test");
        CourseStorageService courseStorageService = new CourseStorageService(repository);
    }

    static class InMemoryCourseRepository implements Course
}