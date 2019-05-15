package yrk.com.ua.human_resources.service;

import yrk.com.ua.human_resources.entity.City;
import yrk.com.ua.human_resources.entity.Department;
import yrk.com.ua.human_resources.entity.Position;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(int id);
    void addDepartment(Department department);
    void updateDepartment(int previousDepartmentId, Department newDepartment);
    void updateDepartment(int previousDepartmentId, Position position);
    void deleteDepartmentById(int id);
    void deleteDepartmentByName(String name);
    void delete(Department department);
}
