package com.example.Homework.repositories.Implementations.JDBC;

import com.example.Homework.models.Students;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
@AllArgsConstructor
@Getter
public class StudentsJDBCImplementation extends DBConnection{
    public List<Students> findAllStudents() throws SQLException {
        connect();

        String findAll = "SELECT * FROM students;";

        return (List<Students>) getStatement().executeQuery(findAll);
    }

    public ResultSet findStudentById(Long id_student) throws SQLException {
        connect();

        String findById = "SELECT * FROM students WHERE id = " + id_student + ";";

        return getStatement().executeQuery(findById);
    }

    public void deleteStudentById(Long id_student) throws SQLException {
        connect();

        String deleteById = "DELETE FROM students WHERE id = " + id_student + ";";

        getStatement().executeUpdate(deleteById);
    }

    public Students addStudent(Students student) throws SQLException {
        connect();

        String addStudent = "INSERT INTO students(student_name, group) VALUES(" + student.getStudent_name() + ", " + student.getGroup() + ");";

        getStatement().executeUpdate(addStudent);

        return student;
    }

    public Students updateStudentById(Long id_student, String student_name, Long group) throws SQLException {
        connect();

        String updateStudent = "UPDATE students SET student_name = " + student_name + " AND group = " + group + " WHERE id_student = " + id_student + ";";

        getStatement().executeUpdate(updateStudent);

        return (Students) findStudentById(id_student);
    }
}
