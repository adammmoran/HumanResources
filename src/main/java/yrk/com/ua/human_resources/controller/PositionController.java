package yrk.com.ua.human_resources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.service.PositionService;

import java.util.List;

@RestController
public class PositionController {
    @Autowired
    PositionService positionService;

    @GetMapping("/api/positions")
    public List<Position> getAllPositions(){
        return positionService.getAllPositions();
    }

    @GetMapping("/api/position/{id}")
    public Position getPositionById(@PathVariable("id")int id){
        return positionService.getPositionById(id);
    }

    @PostMapping("/api/add/position")
    public void addPosition(@RequestBody Position position){
        positionService.addPosition(position);
    }

    @PutMapping("/api/update/position/{id}")
    public void updatePosition(@PathVariable("id")int id, @RequestBody Position position){
        positionService.updatePosition(id, position);
    }

    @DeleteMapping("/api/position/delete/{id}")
    public void deletePositionById(@PathVariable("id")int id){
        positionService.deletePositionById(id);
    }
}
