package yrk.com.ua.human_resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yrk.com.ua.human_resources.entity.Position;

public interface PositionDAO extends JpaRepository<Position, Integer> {
}
