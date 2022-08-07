package com.example.Homework.repositories.Interfaces;

import com.example.Homework.models.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GroupsRepository extends JpaRepository<Groups, Long> {
//    List<Groups> findByName(String group_name);
//
//    @Override
//    List<Groups> findAll();
//
//    @Override
//    Optional<Groups> findById(Long aLong);
}
