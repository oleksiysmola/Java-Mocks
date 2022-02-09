package com.smola.week4.wednesday.person;

import java.util.List;

public interface PersonDAO {
    void savePerson(Person person);
    void deletePerson(Integer id);
    List<Person> getPeople();
    Person getPersonById(Integer id);
}
