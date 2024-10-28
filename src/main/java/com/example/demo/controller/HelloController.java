package com.example.demo.controller;
import com.example.demo.Person;
import com.example.demo.PersonRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class HelloController {

    private final PersonRepository personRepository;

    public HelloController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
    }


}

