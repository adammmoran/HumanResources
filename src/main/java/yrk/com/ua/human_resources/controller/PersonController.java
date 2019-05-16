package yrk.com.ua.human_resources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yrk.com.ua.human_resources.entity.Person;
import yrk.com.ua.human_resources.entity.Position;
import yrk.com.ua.human_resources.entity.Project;
import yrk.com.ua.human_resources.service.PersonService;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/api/persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/api/person/{id}")
    public Person getPersonById(@PathVariable("id") int id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/api/add/person")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @PutMapping("/api/update/person/{id}")
    public void updatePerson(@PathVariable("id") int id, @RequestBody Position position, @RequestBody Project project) {
        personService.updatePerson(id, position, project);
    }

    @DeleteMapping("/api/person/delete/{id}")
    public void deletePersonById(@PathVariable("id") int id) {
        personService.deletePersonById(id);
    }


}
