package com.example.Homework.repositories.Implementations.JPA;

import com.example.Homework.models.Groups;
import com.example.Homework.repositories.Interfaces.GroupsRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Getter
public class GroupsJPAImplementation{
    private GroupsRepository groupsRepo;

    public List<Groups> findAllGroups(){
        return groupsRepo.findAll();
    }

    public Optional<Groups> findGroupById(Long id_group) {
        return groupsRepo.findById(id_group);
    }

    public void deleteGrouptById(Long id_group) {
        groupsRepo.deleteById(id_group);
    }

    public Groups addStudent(Groups group) {
        return groupsRepo.save(group);
    }

    public Groups updateGroupById(Long id_group, String group_name, LocalDate creation_date) {
        Groups grp = new Groups();
        if(groupsRepo.findById(id_group).isPresent()) {
            groupsRepo.save(new Groups(id_group, group_name, creation_date));
        }
        return grp;
    }
}
