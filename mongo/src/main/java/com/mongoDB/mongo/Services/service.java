package com.mongoDB.mongo.Services;

import com.mongoDB.mongo.Entity.person;
import com.mongoDB.mongo.Repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

@Service
public class service {
     repo repository;

     @Autowired
    public service(repo repository) {
        this.repository = repository;
    }

    public List<person> findAllPersons(){
         return repository.findAll();
    }
    public person findPersonByName(String name){
         return repository.findByName(name);
    }
    public person savePerson(person person){
         return repository.save(person);
    }
    public List<person> savePersons(List<person> persons){
         return repository.saveAll(persons);
    }
    public person updatePerson(String name, person person){
         person existingPerson = findPersonByName(name);
         if(existingPerson == null){
             return null;
         }
       existingPerson.setName(person.getName());
         existingPerson.setAge(person.getAge());
         existingPerson.setPassword(person.getPassword());
         existingPerson.setProfession(person.getProfession());
         existingPerson.setCountry(person.getCountry());
         existingPerson.setEmail(person.getEmail());
         return repository.save(existingPerson);
    }
    public Boolean deletePerson(String name){
         person existingPerson = findPersonByName(name);
         if(existingPerson == null){
             return null;
         }
           repository.delete(existingPerson);
         return true;
    }
    public Boolean deleteAllPersons(){
         repository.deleteAll();
         return true;
    }
    public List<person> updatePersons(List<person> persons){
         List<person> temporaryPersons = new ArrayList<>();

      for(person person:persons) {
          person existingPerson = findPersonByName(person.getName());
          if(existingPerson == null){
              temporaryPersons.add(null);
              return null;
          }
          else {
              existingPerson.setName(person.getName());
              existingPerson.setAge(person.getAge());
              existingPerson.setPassword(person.getPassword());
              existingPerson.setProfession(person.getProfession());
              existingPerson.setCountry(person.getCountry());
              existingPerson.setEmail(person.getEmail());
              repository.save(existingPerson);
              temporaryPersons.add(existingPerson);
          }
      }
          return temporaryPersons;
    }
}
