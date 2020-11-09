package com.example.demo.services;

import java.util.Collection;
import java.util.Optional;

import com.example.demo.entity.Person;
import com.example.demo.model.PersonModel;
import com.example.demo.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    // create 
    public ResponseEntity<Object> createName(PersonModel model) {
        Person person = new Person();
        person.setF_name(model.getF_name());
        person.setL_name(model.getL_name());
        personRepository.save(person);
        return ResponseEntity.ok("Successfully.");
    }

    // retrieve
    public String retrieveName(Long id, ModelMap model) {
        Optional<Person> ps = personRepository.findById(id);
        String fullName = ps.get().getFullName();
        model.addAttribute("FullName", fullName);
        return "index";
    }
}