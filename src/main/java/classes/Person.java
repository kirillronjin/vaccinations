package classes;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person>{
    private final int id;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birth_date;
    private Set<Vaccination> vaccinations;

    public Person(int id, String name, String surname, String patronymic, int year, int month, int day) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birth_date = LocalDate.of(year, month, day);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public Set<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(Set<Vaccination> vaccinations) {
        vaccinations.forEach(vaccination ->
                vaccination.setPlanned_date(birth_date.plusDays(vaccination.getPeriod_after_birth()))
        );
        this.vaccinations = vaccinations;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id +
                "', name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birth_date=" + birth_date +
                ", vaccinations=" + vaccinations +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return -this.getBirth_date().compareTo(person.getBirth_date());
    }
}
