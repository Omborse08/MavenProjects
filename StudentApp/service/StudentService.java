package com.example.App.service;

import com.example.App.model.Student;
import com.example.App.repository.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StudentService {

    @Autowired
    private Database database;

    private Map<Integer, Student> studentMap = new HashMap<>();

    public List getAll() {
        return database.getAllStudent();
    }

    public String names(int id) {
        return database.getStudent(id);
    }

    public void add(Student s) {
        database.addStudent(s);
    }

    public void update(Student s) {
        database.updateStudent(s);
    }

    public void delete(int id) {
        database.deleteStudent(id);
    }
}
