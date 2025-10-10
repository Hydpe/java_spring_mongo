package com.mongoDB.mongo.Controllers;

import com.mongoDB.mongo.Entity.person;
import com.mongoDB.mongo.Services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class controller {


    service service;

    @Autowired
    public controller(service service){
        this.service = service;
    }
    @GetMapping("/persons")
    public List<person> findAllPersons(){
        return service.findAllPersons();
    }
    @GetMapping("/person/{name}")
    public person findPersonById(@PathVariable String name){
        return service.findPersonByName(name);
    }
    @PostMapping("/person")
    public person savePerson(@RequestBody person person){
        return service.savePerson(person);
    }
    @PostMapping("/persons")
    public List<person> savePersons(@RequestBody List<person> persons){
        return service.savePersons(persons);
    }
    @PutMapping("/person/{name}")
    public person updatePerson(@PathVariable String name, @RequestBody person person){
        return service.updatePerson(name, person);
    }
    @DeleteMapping("/person/{name}")
    public void deletePerson(@PathVariable String name){
        service.deletePerson(name);
    }
    @DeleteMapping("/persons")
    public void deletePersons(){
        service.deleteAllPersons();
    }
    @PutMapping("/persons")
    public List<person> updatePersons(@RequestBody List<person> persons){
        return service.updatePersons(persons);
    }
}
