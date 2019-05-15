package yrk.com.ua.human_resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import yrk.com.ua.human_resources.entity.City;
import yrk.com.ua.human_resources.entity.Department;
import yrk.com.ua.human_resources.entity.Position;

import java.util.List;

@Repository
public interface DepartmentDAO extends JpaRepository<Department, Integer> {
    @Modifying
    @Query("update Department d set d.departmentName = ?1, d.description = ?2, d.positions = ?3 where d.id = ?4")
    void updateDepartmentById(String departmentName, String description, List<Position> positions, int id);

    @Modifying
    @Query("update Department d set d.positions = ?1 where d.id = ?2")
    void updateDepartmentById(List<Position> positions, int id);

    void deleteByDepartmentName(String name);
}
