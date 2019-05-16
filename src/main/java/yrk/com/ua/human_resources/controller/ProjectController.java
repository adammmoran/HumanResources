package yrk.com.ua.human_resources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yrk.com.ua.human_resources.entity.Project;
import yrk.com.ua.human_resources.service.ProjectService;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/api/projects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/api/project/{id}")
    public Project getProjectById(@PathVariable("id") int id) {
        return projectService.getProjectById(id);
    }

    @PostMapping("/api/add/project")
    public void addProject(@RequestBody Project project) {
        projectService.addProject(project);
    }

    @PutMapping("/api/update/project/{id}")
    public void updateProject(@PathVariable("id") int id, @RequestBody Project project) {
        projectService.updateProject(id, project);
    }

    @DeleteMapping("/api/project/delete/{id}")
    public void deleteProjectById(@PathVariable("id") int id) {
        projectService.deleteProjectById(id);
    }
}
