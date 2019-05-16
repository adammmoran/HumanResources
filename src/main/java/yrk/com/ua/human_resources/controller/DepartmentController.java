package yrk.com.ua.human_resources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yrk.com.ua.human_resources.entity.Department;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.service.DepartmentService;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/api/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
    @GetMapping("/api/department/{id}")
    public Department getDepartmentById(@PathVariable("id")int id){
        return departmentService.getDepartmentById(id);
    }

    @PostMapping("/api/add/department")
    void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @PutMapping("/api/update/department/position/{id}")
    public void updateDepartment(@PathVariable("id")int id, @RequestBody Position position){
        departmentService.updateDepartment(id, position);
    }

    @PutMapping("/api/update/department/{id}")
    public void updateDepartment(@PathVariable("id")int id, @RequestBody Department department){
        departmentService.updateDepartment(id, department);
    }

    @DeleteMapping("/api/department/delete/{id}")
    public void deleteDepartmentById(@PathVariable("id") int id) {
        departmentService.deleteDepartmentById(id);
    }

    @DeleteMapping("/api/department/delete/by/{name}")
    public void deleteDepartmentById(@PathVariable("name")String name){
        departmentService.deleteDepartmentByName(name);
    }

}
