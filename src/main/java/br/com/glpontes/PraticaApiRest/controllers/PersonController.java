package br.com.glpontes.PraticaApiRest.controllers;

import br.com.glpontes.PraticaApiRest.model.Person;
import br.com.glpontes.PraticaApiRest.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;
    //private PersonServices service = new PersonServices();
    @RequestMapping(value = "/{id}",
            method= RequestMethod.GET)
    public Person findById(
            @PathVariable(value = "id") String id){
        return service.findById(id);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Person> findAll(){
        return service.findAll();
    }
}
