package com.example.Homework.controllers;

import com.example.Homework.models.Students;
import com.example.Homework.repositories.Implementations.JDBC.StudentsJDBCImplementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class HomeworkController {
/*
      @GetMapping("/students")
      public @ResponseBody List<Students> getStudents() throws SQLException {
          return StudentsJDBCImplementation.findAllStudents();
      }

      @GetMapping("/students/{id}")
      public @ResponseBody Students getStudentsById(@PathVariable Long id_students) throws SQLException {
          return StudentsJDBCImplementation.findStudentById();
      }
*/
    @GetMapping("/")
    public String HelloWorld() {
        return "Hello World!";
    }

    @GetMapping({"/hello/{name}", "/hello/"})
    public String HelloName(@PathVariable(required = false) String name) {
        if (name == null){
            return "Hello World!";
        } else {
            return "Hello "+ name + "!";
        }
    }
}
