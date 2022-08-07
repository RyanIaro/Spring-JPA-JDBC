package com.example.Homework.repositories.Interfaces;

import com.example.Homework.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentsRepository extends JpaRepository<Students, Long> {
//    List<Students> findByName(String student_name);
//
//    @Override
//    List<Students> findAll();
//
//    @Override
//    Optional<Students> findById(Long aLong);
}
