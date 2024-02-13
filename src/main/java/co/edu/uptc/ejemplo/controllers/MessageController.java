package co.edu.uptc.ejemplo.controllers;

import co.edu.uptc.ejemplo.models.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uptc.ejemplo.models.Person;

@RestController
@RequestMapping("/info")
public class MessageController {

    @GetMapping
    public String getmessager(){
        return "HOLAAA MUNDO";
    }

    @GetMapping("/person")
    public Person getPerson(){
        PersonService personService = new PersonService();
        return personService.generatePerson();
    }
}
