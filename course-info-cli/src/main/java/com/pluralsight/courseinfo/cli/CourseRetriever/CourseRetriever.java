package com.pluralsight.courseinfo.cli.CourseRetriever;

import com.pluralsight.courseinfo.cli.service.CourseRetrievalService;
import com.pluralsight.courseinfo.cli.service.PluralsightCourse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CourseRetriever {
    private static final Logger LOG  = LoggerFactory.getLogger(CourseRetriever.class);
    public static void main(String... args){
        LOG.info("CourseRetriever started");
        LOG.warn("Course Retriever started!");
        if(args.length == 0) {
            System.out.println("Veuillez entrer le nom de l'auteur en premier argument");
            return;
        }
        try{
            //retrieveCourses(args[0]);
            PluralsightCourse course = new PluralsightCourse("id", "title", "00:54:57", "https://url", false);
            LOG.info("course:{}", course);
        }catch (Exception e){
            LOG.error("unexpected error");
            e.printStackTrace();
        }
        retrieveCourses(args[0]);
    }

    private static void retrieveCourses(String authorId) {
        LOG.info("Recuperation de l'auteur des cours '{}'", authorId);
        CourseRetrievalService courseRetrievalService = new CourseRetrievalService();

        List<PluralsightCourse> coursesToStore = courseRetrievalService.getCoursesFor(authorId);
        LOG.info("Retrieved the following {} courses {}", coursesToStore.size(), coursesToStore);
    }
}
