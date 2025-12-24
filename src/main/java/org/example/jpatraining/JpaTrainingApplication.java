package org.example.jpatraining;

import org.example.jpatraining.entities.Course;
import org.example.jpatraining.entities.Section;
import org.example.jpatraining.repo.CourseRepository;
import org.example.jpatraining.repo.SectionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaTrainingApplication.class, args);




    }

    @Bean
    CommandLineRunner run(CourseRepository courseRepo, SectionRepository sectionRepo) {
        return args -> {
            Course course = new Course();
            course.setCourseName("Java Basics");
            course.setCourseCode("JAVA101");
            course.setCourseDescription("Intro to Java");
            courseRepo.save(course);

            Section section = new Section();
            section.setName("Section A");
            section.setCourse(course);
            sectionRepo.save(section);
        };
    }


}
