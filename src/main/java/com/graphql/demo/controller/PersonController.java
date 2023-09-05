package com.graphql.demo.controller;

import com.graphql.demo.entity.Person;
import com.graphql.demo.repo.PersonRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonRepo repo;
    @GetMapping("fetch")
    public ResponseEntity<List<Person>> fetchPersons(){
        log.info("Fetching all persons");
        return ResponseEntity.ok(repo.findAll());
    }

    @PostMapping("add")
    public ResponseEntity<List<Person>> addPersons(@RequestBody List<Person> persons){
        log.info("Adding all person");
        return ResponseEntity.ok(repo.saveAll(persons));
    }

}
