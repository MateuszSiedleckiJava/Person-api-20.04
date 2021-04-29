package pl.kurs.java.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Employee extends Person {
    private String currentPosition;
    private String currentCompany;
    private double currentSalary;
    private LocalDate hireDate;

    public Employee(String name, String surname, String pesel, String currentPosition, String currentCompany, double currentSalary, LocalDate hireDate) {
        super(name, surname, pesel);
        this.currentPosition = currentPosition;
        this.currentCompany = currentCompany;
        this.currentSalary = currentSalary;
        this.hireDate = hireDate;
    }
}
