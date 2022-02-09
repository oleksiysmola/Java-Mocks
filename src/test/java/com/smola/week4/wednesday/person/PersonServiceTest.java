package com.smola.week4.wednesday.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

class PersonServiceTest {

    private PersonDAO personDAO;
    private PersonService underTest;

    @BeforeEach
    void setUp() {
        // TODO: create a mock for personDAO
        // TODO: create an instance of underTest and pass personDAO into it
        // Setup people to use for mocks
        List<Person> peopleMockData = new ArrayList<>();
        Person ryan = new Person(1, "Ryan", 20);
        Person katie = new Person(2, "Katie", 25);
        peopleMockData.add(ryan);
        peopleMockData.add(katie);
        // Extra person
        Person extraPerson = new Person(3, "Dave", 40);

        // Create mock of PersonDAO
        personDAO = Mockito.mock(PersonDAO.class);
        given(personDAO.getPeople()).willReturn(peopleMockData);
        // Construct service with mock
        underTest = new PersonService(personDAO);

    }

    /*
       TODO: Test all these methods.
        You might need to create additional methods. Check test coverage
    */

    //    Good luck :)

    @Test
    void itCanSavePerson() {
        // Given
        Person newPerson = new Person(3, "Dave", 40);

        // When
        underTest.savePerson(newPerson);

        // Then
        verify(personDAO).savePerson(newPerson);
    }

    @Test
    void itCanDeletePerson() {
        // Given
        Integer idToDelete = 1;

        // When
        underTest.deletePerson(idToDelete);

        // Then
        verify(personDAO).deletePerson(idToDelete);
    }

    @Test
    void canGetPeopleFromDB() {
        // Given
        // When
        // Then
    }

    @Test
    void canGetPersonById() {

    }
}

