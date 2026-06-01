package com.example.App.controller;

import com.example.App.model.Student;
import com.example.App.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Home")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("GET")
    public List getAll() {
        return service.getAll();
    }

    @GetMapping("GET/{id}")
    public String getOne(@PathVariable int id) {
        return service.names(id);
    }

    @PostMapping("POST")
    public String add(@RequestBody Student s) {
        service.add(s);
        return "Added";
    }

    @PutMapping("PUT")
    public void update(@RequestBody Student s) {
        service.update(s);
    }

    @DeleteMapping("DELETE/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted.";
    }
}
