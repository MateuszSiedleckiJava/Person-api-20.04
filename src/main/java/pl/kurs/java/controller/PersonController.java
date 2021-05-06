package pl.kurs.java.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.kurs.java.model.Person;
import pl.kurs.java.model.query.FindPersonQuery;
import pl.kurs.java.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping("/all")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<Person>> getAllPersons(@RequestParam(value = "type", required = false) String type) {
        if (type == null) {
            return ResponseEntity.ok(personService.findAll());
        } else {
            return ResponseEntity.ok(personService.findPersonsByType(type));
        }
    }

    @GetMapping("/filter")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<Person>> getPersonsByName(@RequestParam(value = "name") String name) {
        //         localhost:8080/person/filter?name=mateusz
        return ResponseEntity.ok(personService.searchByName(name));
    }

    @GetMapping("/Query")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<Person>> getPersonsByParams(@ModelAttribute FindPersonQuery findPersonQuery) {
        //         localhost:8080/person/Query?name=a&gender=M&birthDateFrom=1950-01-05
        return ResponseEntity.ok(personService.searchByFindPersonQuery(findPersonQuery));
    }
}
