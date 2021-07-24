package com.harshil.springboottutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student harshil = new Student(
                    "Harshil",
                    "harshil@xyz.com",
                    LocalDate.of(2568, Month.APRIL, 7)
            );

            Student harshil1 = new Student(
                    "Harshil1",
                    "harshil1@xyz.com",
                    LocalDate.of(2568, Month.MARCH, 7)
            );

            repository.saveAll(
                    List.of(harshil1, harshil)
            );
        };
    }
}
