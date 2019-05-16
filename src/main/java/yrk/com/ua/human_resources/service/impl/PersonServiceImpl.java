package yrk.com.ua.human_resources.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yrk.com.ua.human_resources.entity.Person;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.entity.Project;
import yrk.com.ua.human_resources.repository.PersonDAO;
import yrk.com.ua.human_resources.service.PersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDAO personDAO;

    @Override
    public List<Person> getAllPersons() {
        return personDAO.findAll();
    }

    @Override
    public Person getPersonById(int id) {
        return personDAO.findById(id).get();
    }

    @Override
    public void addPerson(Person person) {
        personDAO.save(person);
    }

    @Override
    public void deletePersonById(int id) {
        personDAO.deleteById(id);
    }

    @Override
    public void updatePerson(int prevId, Position position, Project project) {
        personDAO.updatePerson(position, project, prevId);
    }
}
