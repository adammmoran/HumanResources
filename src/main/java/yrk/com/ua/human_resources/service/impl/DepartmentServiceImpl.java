package yrk.com.ua.human_resources.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yrk.com.ua.human_resources.entity.City;
import yrk.com.ua.human_resources.entity.Department;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.repository.DepartmentDAO;
import yrk.com.ua.human_resources.service.DepartmentService;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentDAO departmentDAO;

    @Override
    public List<Department> getAllDepartments() {
        return departmentDAO.findAll();
    }

    @Override
    public Department getDepartmentById(int id) {
        return departmentDAO.findById(id).get();
    }

    @Override
    public void addDepartment(Department department) {
        departmentDAO.save(department);
    }

    @Override
    public void updateDepartment(int previousDepartmentId, Department newDepartment) {
        departmentDAO.updateDepartmentById(newDepartment.getDepartmentName(),
                newDepartment.getDescription(), newDepartment.getPositions(), previousDepartmentId);
    }

    @Override
    public void updateDepartment(int previousDepartmentId, Position position) {
        Department department = departmentDAO.findById(previousDepartmentId).get();
        department.addPosition(position);
        departmentDAO.updateDepartmentById(department.getPositions(), previousDepartmentId);
    }

    @Override
    public void deleteDepartmentById(int id) {
        departmentDAO.deleteById(id);
    }

    @Override
    public void deleteDepartmentByName(String name) {
        departmentDAO.deleteByDepartmentName(name);
    }

    @Override
    public void delete(Department department) {
        departmentDAO.delete(department);
    }
}
