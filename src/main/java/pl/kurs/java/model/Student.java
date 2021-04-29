package pl.kurs.java.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student extends Person {
    private String specialization;
    private String studyDirection;
    private int semester;
    private double average;

    public Student(String name, String surname, String pesel, String specialization, String studyDirection, int semester, double average) {
        super(name, surname, pesel);
        this.specialization = specialization;
        this.studyDirection = studyDirection;
        this.semester = semester;
        this.average = average;
    }
}
