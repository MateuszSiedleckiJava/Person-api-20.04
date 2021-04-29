package pl.kurs.java.model.query;

import com.querydsl.core.types.dsl.BooleanExpression;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import pl.kurs.java.model.QPerson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
public class FindPersonQuery {
    private String name;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDateTo;
    private String pesel;

    public BooleanExpression toPredicate(){
        QPerson qPerson = QPerson.person;
        List<BooleanExpression> expressions = new ArrayList<>();
        Optional.ofNullable(isNameContainsName(name, qPerson)).ifPresent(expressions::add);
        Optional.ofNullable(isGenderLikeProvidedGender(gender, qPerson)).ifPresent(expressions::add);
        Optional.ofNullable(isPeselContainsNumbers(pesel, qPerson)).ifPresent(expressions::add);
        Optional.ofNullable(isBirthDateAfterDateFrom(birthDateFrom, qPerson)).ifPresent(expressions::add);

        BooleanExpression finalExpression = qPerson.id.isNotNull();
        for(BooleanExpression expr : expressions){
            finalExpression = finalExpression.and(expr);
        }

        return finalExpression;
    }

    private BooleanExpression isNameContainsName(String name, QPerson qPerson) {
        return name != null ? qPerson.name.containsIgnoreCase(name) : null;
    }

    private BooleanExpression isGenderLikeProvidedGender(String gender, QPerson qPerson) {
        //select * from person where substring(pesel,10,1) % 2 = 0;

        if (gender != null && gender.equalsIgnoreCase("m")) {
            return qPerson.pesel.charAt(9).in('1', '3', '5', '7', '9');
        } else if (gender != null && gender.equalsIgnoreCase("f")) {
            return qPerson.pesel.charAt(9).in('0', '2', '4', '6', '8');
        } else {
            return null;
        }
    }

    private BooleanExpression isPeselContainsNumbers(String numbers, QPerson qPerson) {
        return numbers != null ? qPerson.pesel.containsIgnoreCase(numbers) : null;
    }

    private BooleanExpression isBirthDateAfterDateFrom(LocalDate dateFrom, QPerson qPerson) {
        return dateFrom != null ? qPerson.birthDate.after(dateFrom) : null;
    }
}
