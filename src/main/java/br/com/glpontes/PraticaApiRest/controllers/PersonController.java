package br.com.glpontes.PraticaApiRest.controllers;

import br.com.glpontes.PraticaApiRest.model.Person;
import br.com.glpontes.PraticaApiRest.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;
    //private PersonServices service = new PersonServices();
    @RequestMapping(value = "/{id}",
            method= RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(
            @PathVariable(value = "id") String id){
        return service.findById(id);
    }
    @RequestMapping(value = "/{id}",
            method= RequestMethod.GET)
    public Person create(
            @RequestBody Person person){
        return service.create(person);
    }


    @RequestMapping(method= RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll(){
        return service.findAll();
    }
}
