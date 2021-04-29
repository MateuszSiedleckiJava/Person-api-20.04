package pl.kurs.java.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Retirement extends Person {
    private int yearsOfExperience;
    private double amount;

    public Retirement(String name, String surname, String pesel, int yearsOfExperience, double amount) {
        super(name, surname, pesel);
        this.yearsOfExperience = yearsOfExperience;
        this.amount = amount;
    }
}
