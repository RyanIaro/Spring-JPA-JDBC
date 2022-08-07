package com.example.Homework.repositories.Implementations.JPA;

import com.example.Homework.models.Students;
import com.example.Homework.repositories.Interfaces.StudentsRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Getter
public class StudentsJPAImplementation {
    private StudentsRepository studentsRepo;

    public List<Students> findAllStudents(){
        return studentsRepo.findAll();
    }

    public Optional<Students> findStudentById(Long id_student) {
        return studentsRepo.findById(id_student);
    }

    public void deleteStudentById(Long id_student) {
        studentsRepo.deleteById(id_student);
    }

    public Students addStudent(Students student) {
        return studentsRepo.save(student);
    }

    public Students updateStudentById(Long id_student, String student_name, Long group) {
        Students std = new Students();
        if(studentsRepo.findById(id_student).isPresent()) {
            studentsRepo.save(new Students(id_student, student_name, group));
        }
        return std;
    }
}
