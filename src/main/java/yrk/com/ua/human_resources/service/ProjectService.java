package yrk.com.ua.human_resources.service;

import yrk.com.ua.human_resources.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProjects();

    Project getProjectById(int id);

    void addProject(Project project);

    void deleteProjectById(int id);

    void updateProject(int prevId, Project project);
}
