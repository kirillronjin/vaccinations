
import classes.Person;
import classes.Vaccination;
import dao.PersonDAO;
import dao.VaccinationDAO;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        System.out.println(personDAO.getPersons());

    }
}
