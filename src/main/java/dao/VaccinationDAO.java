package dao;

import classes.Person;
import classes.Vaccination;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class VaccinationDAO {

    private int VACCINATIONS_COUNT = 0;
    private Set<Vaccination> vaccinations;

    {
        Vaccination hepatitis1 = new Vaccination(++VACCINATIONS_COUNT, "hepatitis1", 30);
        Vaccination hepatitis2 = new Vaccination(++VACCINATIONS_COUNT, "hepatitis2", 60);
        Vaccination diphtheria = new Vaccination(++VACCINATIONS_COUNT, "diphtheria", 90);
        this.vaccinations = new TreeSet<>(Arrays.asList(hepatitis1, hepatitis2, diphtheria));
    }

    public Set<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(Set<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Vaccination getVaccinationById(int id) {
        return this.vaccinations.stream().filter(vaccination -> vaccination.getId() == id).findFirst().orElse(null);
    }

}
