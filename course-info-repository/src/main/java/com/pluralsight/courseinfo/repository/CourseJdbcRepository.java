package com.pluralsight.courseinfo.repository;

import com.pluralsight.courseinfo.domain.Course;
import org.h2.jdbcx.JdbcDataSource;

import javax.sql.DataSource;
import java.util.List;

public class CourseJdbcRepository implements CourseRepository{
    private static final String H2_DATABASE_URL =
            "jdbc:h2:file:%s;AUTO_SERVER=TRUE;INIT=RUNSCRIPT FROM './db_init.sql'";

    private final DataSource dataSource;

    public CourseJdbcRepository(String databaseFile){
        JdbcDataSource jdbcDataSource = new JdbcDataSource();
        jdbcDataSource.setUrl(H2_DATABASE_URL);
        this.dataSource = jdbcDataSource;
    }

    @Override
    public void saveCourse(Course course){
    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

}