package yrk.com.ua.human_resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import yrk.com.ua.human_resources.entity.Position;

public interface PositionDAO extends JpaRepository<Position, Integer> {
    @Modifying
    @Query("update Position p set p.description = ?1, p.positionName = ?2 where p.id = ?3")
    void updatePerson(String description, String positionName, int id);
}
