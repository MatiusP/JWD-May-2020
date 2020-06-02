package by.epam.protsko.module_4;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task_02 {

    private static boolean isNonLeapYear() {
        return ((GregorianCalendar) Calendar.getInstance()).isLeapYear(LocalDateTime.now().getYear());
    }

    private static LocalDate getDayMonth(int dayNumber) {
        int nonLeapYear;
        if (!isNonLeapYear()) {
            nonLeapYear = LocalDateTime.now().getYear();
        } else {
            nonLeapYear = LocalDateTime.now().getYear() - 1;
        }
        Year year = Year.of(nonLeapYear);
        return year.atDay(dayNumber);
    }

    static LocalDate getDayMonthByDayNumber(int dayNumber) {
        if (dayNumber > 0 && dayNumber <= 365) {
            return getDayMonth(dayNumber);
        } else {
            throw new DateTimeException("Invalid value for DayOfYear");
        }
    }


    //----- check result -----
    public static void main(String[] args) {
        LocalDate date = getDayMonthByDayNumber(95);
        LocalDate date1 = getDayMonthByDayNumber(258);
        System.out.println(date.getDayOfMonth() + " " + date.getMonth());
        System.out.println(date1.getDayOfMonth() + " " + date1.getMonth());
    }
}
