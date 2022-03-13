package classes;

import java.time.LocalDate;
import java.util.Date;

public class Vaccination implements Comparable<Vaccination>{
    private final int id;
    private String name;
    private LocalDate planned_date;
    private LocalDate fact_date;
    private final int period_after_birth;

    public Vaccination(int id, String name, int period_after_birth) {
        this.id = id;
        this.name = name;
        this.period_after_birth = period_after_birth;
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

    public LocalDate getPlanned_date() {
        return planned_date;
    }

    public void setPlanned_date(LocalDate planned_date) {
        this.planned_date = planned_date;
    }

    public LocalDate getFact_date() {
        return fact_date;
    }

    public void setFact_date(LocalDate fact_date) {
        this.fact_date = fact_date;
    }

    public int getPeriod_after_birth() {
        return period_after_birth;
    }

    @Override
    public String toString() {
        return "Vaccination{" +
                "id='" + id + '\'' +
                ", name='" + name +
                "', planned_date=" + planned_date +
                ", fact_date=" + fact_date +
                ", period_after_birth=" + period_after_birth +
                '}';
    }

    @Override
    public int compareTo(Vaccination vaccination) {
        return this.getPeriod_after_birth() - vaccination.getPeriod_after_birth();
    }
}
