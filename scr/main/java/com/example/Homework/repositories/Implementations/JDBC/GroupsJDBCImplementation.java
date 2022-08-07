package com.example.Homework.repositories.Implementations.JDBC;

import com.example.Homework.models.Groups;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Getter
public class GroupsJDBCImplementation extends DBConnection{

    public List<Groups> findAllGroups() throws SQLException {
        connect();

        String findAll = "SELECT * FROM groups;";

        return (List<Groups>) getStatement().executeQuery(findAll);
    }

    public ResultSet findGroupById(Long id_group) throws SQLException {
        connect();

        String findById = "SELECT * FROM groups WHERE id = " + id_group + ";";

        return getStatement().executeQuery(findById);
    }

    public void deleteGroupById(Long id_group) throws SQLException {
        connect();

        String deleteById = "DELETE FROM groups WHERE id = " + id_group + ";";

        getStatement().executeUpdate(deleteById);
    }

    public Groups addGroup(Groups group) throws SQLException {
        connect();

        String add = "INSERT INTO group(group_name, creation_date) VALUES(" + group.getGroup_name() + ", " + group.getCreation_date() + ");";

        getStatement().executeUpdate(add);

        return group;
    }

    public Groups updateGroupById(Long id_group, String group_name, LocalDate creation_date) throws SQLException {
        connect();

        String update = "UPDATE groups SET group_name = " + group_name + " AND creation_date = " + creation_date + " WHERE id_group = " + id_group + ";";

        getStatement().executeUpdate(update);

        return (Groups) findGroupById(id_group);
    }
}
