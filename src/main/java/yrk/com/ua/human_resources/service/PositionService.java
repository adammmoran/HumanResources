package yrk.com.ua.human_resources.service;

import yrk.com.ua.human_resources.entity.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAllPositions();

    Position getPositionById(int id);

    void addPosition(Position position);

    void deletePositionById(int id);

    void updatePosition(int prevId, Position position);
}
