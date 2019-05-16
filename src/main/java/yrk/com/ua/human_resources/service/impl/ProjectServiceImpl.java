package yrk.com.ua.human_resources.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yrk.com.ua.human_resources.entity.Project;
import yrk.com.ua.human_resources.repository.ProjectDAO;
import yrk.com.ua.human_resources.service.ProjectService;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectDAO projectDAO;

    @Override
    public List<Project> getAllProjects() {
        return projectDAO.findAll();
    }

    @Override
    public Project getProjectById(int id) {
        return projectDAO.findById(id).get();
    }

    @Override
    public void addProject(Project project) {
        projectDAO.save(project);
    }

    @Override
    public void deleteProjectById(int id) {
        projectDAO.deleteById(id);
    }

    @Override
    public void updateProject(int prevId, Project project) {
        projectDAO.updatePerson(project.getDescription(), project.getName(), prevId);
    }
}
