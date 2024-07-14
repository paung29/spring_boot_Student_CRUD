package com.adibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudent(){
        return List.of(
                new Student(
                        "Aike Paung",
                        "Bra",
                        LocalDate.now(),
                        "aikepaung767@gmail.com",
                        19
                ),
                new Student(
                        "Naw",
                        "Deborh",
                        LocalDate.now(),
                        "debra@gmail.com",
                        20
                )
        );
    }

}
