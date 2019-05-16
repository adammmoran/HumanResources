package yrk.com.ua.human_resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import yrk.com.ua.human_resources.entity.Person;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.entity.Project;

public interface PersonDAO extends JpaRepository<Person, Integer> {
    @Modifying
    @Query("update Person p set p.position = ?1, p.project = ?2 where p.id = ?3")
    void updatePerson(Position position, Project project, int id);
}
