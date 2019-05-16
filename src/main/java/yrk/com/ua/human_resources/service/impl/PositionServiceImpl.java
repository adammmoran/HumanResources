package yrk.com.ua.human_resources.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.repository.PositionDAO;
import yrk.com.ua.human_resources.service.PositionService;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionDAO positionDAO;

    @Override
    public List<Position> getAllPositions() {
        return positionDAO.findAll();
    }

    @Override
    public Position getPositionById(int id) {
        return positionDAO.findById(id).get();
    }

    @Override
    public void addPosition(Position position) {
        positionDAO.save(position);
    }

    @Override
    public void deletePositionById(int id) {
        positionDAO.deleteById(id);
    }

    @Override
    public void updatePosition(int prevId, Position position) {
        positionDAO.updatePerson(position.getDescription(), position.getPositionName(), prevId);
    }
}
