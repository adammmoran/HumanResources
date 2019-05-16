package yrk.com.ua.human_resources.service;

import yrk.com.ua.human_resources.entity.Person;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.entity.Project;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();

    Person getPersonById(int id);

    void addPerson(Person person);

    void deletePersonById(int id);

    void updatePerson(int prevId, Position position, Project project);


}
