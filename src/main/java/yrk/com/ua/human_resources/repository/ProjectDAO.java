package yrk.com.ua.human_resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yrk.com.ua.human_resources.entity.Project;

public interface ProjectDAO extends JpaRepository<Project, Integer> {
}
