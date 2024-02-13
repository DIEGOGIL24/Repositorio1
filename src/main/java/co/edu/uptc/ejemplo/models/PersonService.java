package co.edu.uptc.ejemplo.models;

public class PersonService {
    public Person generatePerson(){
        Person person = new Person();
        person.setName("Diego");
        person.setWeight(4532);
        person.setLastName("Gil");
        return person;
    }
}
