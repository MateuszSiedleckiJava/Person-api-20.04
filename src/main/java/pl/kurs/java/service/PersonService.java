package pl.kurs.java.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.kurs.java.model.Person;
import pl.kurs.java.model.query.FindPersonQuery;
import pl.kurs.java.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public List<Person> findPersonsByType(String type) {
        return personRepository.findByType(type);
    }

    public List<Person> searchByName(String name) {
        return personRepository.findAll();
    }

    //praca domowa
    public List<Person> searchByFindPersonQuery(FindPersonQuery findPersonQuery) {
        return personRepository.findAll(findPersonQuery.toPredicate(), PageRequest.of(0, Integer.MAX_VALUE)).getContent();
    }


//    private final StudentRepository studentRepository;
//    private final EmployeeRepository employeeRepository;
//    private final RetirementRepository retirementRepository;
//    @PostConstruct
//    public void init() {
//        Student student1 = new Student("Mateusz", "Siedlecki", "87063043979", "programming", "IT", 7, 4.5);
//        Student student2 = new Student("Arek", "Marek", "72110541412", "programming", "IT", 3, 3.5);
//
//        studentRepository.saveAndFlush(student1);
//        studentRepository.saveAndFlush(student2);
//
//        Employee employee1 = new Employee("Urszula", "Kowal", "07323032725", "Kasjer",
//                "Zabka", 3000, LocalDate.of(2021, 03, 21));
//        Employee employee2 = new Employee("Dorota", "Kowal", "06291279444", "Kasjer",
//                "Zabka", 3200, LocalDate.of(2021, 04, 21));
//
//        employeeRepository.saveAndFlush(employee1);
//        employeeRepository.saveAndFlush(employee2);
//
//        Retirement retirement1 = new Retirement("Agata", "Nowak", "60081051663", 10, 2000);
//        Retirement retirement2 = new Retirement("Magda", "Kowalska", "50073157664", 10, 2000);
//        Retirement retirement3 = new Retirement("Dorota", "Filipowicz", "89051881727", 10, 2000);
//        Retirement retirement4 = new Retirement("Iwona", "Stec", "47041788641", 10, 2000);
//
//        retirementRepository.saveAndFlush(retirement1);
//        retirementRepository.saveAndFlush(retirement2);
//        retirementRepository.saveAndFlush(retirement3);
//        retirementRepository.saveAndFlush(retirement4);
//
//    }
}

