package yrk.com.ua.human_resources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yrk.com.ua.human_resources.entity.Department;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.service.DepartmentService;

import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/test")
    public String main(){
        Department departmentById = departmentService.getDepartmentById(4);
        System.out.println(departmentById.getPositions());
        Position position = Position.builder().description("asdfghjkl").positionName("Junior").build();
        departmentService.updateDepartment(4,position);
        Department departmentById2 = departmentService.getDepartmentById(4);
        System.out.println();
        System.out.println(departmentById2.getPositions());
        return "main";
    }

}
