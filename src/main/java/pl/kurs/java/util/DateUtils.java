package pl.kurs.java.util;

import com.querydsl.core.types.dsl.DateExpression;

import java.time.LocalDate;

public class DateUtils {
    public static LocalDate birthDateFromPesel(String pesel) {
        if (pesel == null) {
            return null;
        } else if (!pesel.matches("\\d{11}")) {
            return null;
        }

        int[] peselAsIntArray = new int[11];

        for (int i = 0; i < 11; i++) {
            peselAsIntArray[i] = Character.getNumericValue(pesel.charAt(i));
        }

        int birthDay = 10 * peselAsIntArray[4] + peselAsIntArray[5];
        int birthYear = 10 * peselAsIntArray[0] + peselAsIntArray[1];
        int birthMonth = 10 * peselAsIntArray[2] + peselAsIntArray[3];

        if (birthMonth <= 12) birthYear += 1900;
        else if (birthMonth <= 32) {
            birthYear += 2000;
            birthMonth -= 20;
        } else if (birthMonth <= 52) {
            birthYear += 2100;
            birthMonth -= 40;
        } else if (birthMonth <= 72) {
            birthYear += 2200;
            birthMonth -= 60;
        } else if (birthMonth <= 92) {
            birthYear += 1800;
            birthMonth -= 80;
        } else {
            return null;
        }

        return LocalDate.of(birthYear, birthMonth, birthDay);
    }
}
