package yrk.com.ua.human_resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import yrk.com.ua.human_resources.entity.Project;

public interface ProjectDAO extends JpaRepository<Project, Integer> {
    @Modifying
    @Query("update Project p set p.description = ?1, p.name = ?2 where p.id = ?3")
    void updatePerson(String description, String projectName, int id);
}
