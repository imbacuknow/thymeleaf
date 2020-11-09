package com.example.demo.controller;

import java.util.Collection;

import com.example.demo.entity.Person;
import com.example.demo.model.PersonModel;
import com.example.demo.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String Main() {
        return "index";
    }

    @GetMapping("/{id}")
    public String getFullName(@PathVariable Long id, ModelMap model) {
        return personService.retrieveName(id, model);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> PostCreate(@RequestBody PersonModel model) {
            return personService.createName(model);
    } 
}