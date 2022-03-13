package dao;

import classes.Person;
import classes.Vaccination;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PersonDAO {

    private static int PERSON_COUNT = 0;
    private Set<Person> persons;

    {
        Person kirill = new Person(++PERSON_COUNT,"Kirill", "Ronzhin", "Maximovich", 1999, 10, 17);
        Person arina = new Person(++PERSON_COUNT,"Arina", "Ronzhina", "Maximovna", 2003, 9, 22);
        Person zhenya = new Person(++PERSON_COUNT,"Evgenia", "Ronzhina", "Maximovna", 2014, 3, 17);
        persons = new TreeSet<>(Arrays.asList(arina, kirill, zhenya));

        persons.forEach(person -> {
            VaccinationDAO vaccinationDAO = new VaccinationDAO();
            person.setVaccinations(vaccinationDAO.getVaccinations());
        });
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public void deleteById(int id) {
        this.persons.removeIf(p -> p.getId() == id);
    }

    public Person getPersonById(int id) {
        return this.persons.stream().filter(person -> person.getId() == id).findFirst().orElse(null);
    }
}
