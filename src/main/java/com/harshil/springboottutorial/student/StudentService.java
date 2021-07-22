package com.harshil.springboottutorial.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Harshil",
                        "harshil@xyz.com",
                        LocalDate.of(2568, Month.APRIL, 7),
                        34
                )
        );
    }

}
