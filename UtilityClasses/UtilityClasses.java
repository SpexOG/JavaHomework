package UtilityClasses;

import com.sun.source.tree.TryTree;
import jdk.jfr.Event;

import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.time.zone.ZoneRulesException;
import java.util.*;
import java.util.spi.TimeZoneNameProvider;

public class UtilityClasses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        displayTodaysDate();

        displayDateComponents(scanner);

        createSpecificDate();

        areDatesEqual(scanner);

        isTodaySpecificDate(scanner);

        displayCurrentTime();

        addWeeksToToday(scanner);

        findDayOfWeek(scanner);

        daysBetween(scanner);

        isValidDate(scanner);

        elapsedTimeSince(scanner);

        convertToTimeZone(scanner);

        scanner.close();

    }

    // Write a method named displayTodaysDate that, when called, prints the current date to the console.
    // Expected Output: Today's date in the format YYYY-MM-DD.
    private static void displayTodaysDate() {

        LocalDate today = LocalDate.now();
        System.out.println("Data de azi: " + today);

    }

    //Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
    //Input: A date in the format YYYY-MM-DD.
    //Expected Output:
    //makefile
    //Copy code
    //Year: YYYY
    //Month: MM
    //Day: DD
    private static void displayDateComponents(Scanner scanner) {

        System.out.println("Introduceti data: ");
        String date = scanner.nextLine();
        LocalDate dateComp = LocalDate.parse(date);
        System.out.println("Year: " + dateComp.getYear());
        System.out.println("Month: " + dateComp.getMonthValue());
        System.out.println("Day: " + dateComp.getDayOfMonth());

    }

    // Write a method named createSpecificDate that returns a date object representing 19th August 2025.
    // Expected Output: A date object for 2025-8-19.
    private static void createSpecificDate() {

        LocalDate date = LocalDate.of(2025, 8, 19);
        System.out.println(date);

    }

    //  Comparing User-Entered Dates
    //  Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise.
    //  Input: Two dates entered by the user in the format YYYY-MM-DD.
    //  Expected Output:
    //  true if both dates are equal.
    //  false if they are different.
    private static void areDatesEqual(Scanner scanner) {

        System.out.println("Introduceti prima data: ");
        String date = scanner.nextLine();

        System.out.println("Introduceti a doua data: ");
        String date2 = scanner.nextLine();

        LocalDate dateCompare = LocalDate.parse(date);
        LocalDate date2Compare = LocalDate.parse(date2);

        System.out.println("Sunt cele 2 date egale? : " + dateCompare.isEqual(date2Compare));

    }

    //  Is Today a Specific Date?
    //  Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
    //  Expected Output:
    //  true if today's date is 2019-12-10.
    //  false otherwise.
    private static void isTodaySpecificDate(Scanner scanner) {

        System.out.println("Introduceti data specifica: ");
        String dateSpecific = scanner.nextLine();

        LocalDate date = LocalDate.now();
        LocalDate speficicDate = LocalDate.parse(dateSpecific);

        System.out.println("Este data de astazi " + speficicDate + " ? : " + date.isEqual(speficicDate));

    }

    //  Getting Current Time
    //  Description: Write a method named displayCurrentTime that prints the current time to the console.
    //  Expected Output: The current time in the format HH:MM:SS.
    private static void displayCurrentTime() {

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Timpul curent: " + time.format(formatter));

    }

    //  Date Arithmetic
    //  Description: Write a method named addWeeksToToday that accepts an integer as its argument.
    //  This integer denotes the number of weeks.
    //  The method should add this number of weeks to today's date and return the resultant date.
    //  Input: An integer n (e.g., 4).
    //  Expected Output: A date object that is n weeks from today.
    private static void addWeeksToToday(Scanner scanner) {

        System.out.println("Introduceti numarul: ");
        int numbersOfWeeks = scanner.nextInt();

        LocalDate date = LocalDate.now();
        System.out.println("Data de azi: " + date);

        System.out.println("Data de peste " + numbersOfWeeks + " saptamani, este: " + date.plusWeeks(numbersOfWeeks));

    }

    //  Weekday Identifier
    //  Description: Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
    //  Input: A date in the format YYYY-MM-DD.
    //  Expected Output: The day of the week in string format (e.g., "Wednesday").
    private static void findDayOfWeek(Scanner scanner) {

        System.out.println("Introduceti data: ");
        String date = scanner.nextLine();

        LocalDate date1 = LocalDate.parse(date);

        System.out.println("Ziua saptamanii din data introdusa este: " + date1.getDayOfWeek());

    }

    //  Interval Between Dates
    //  Description: Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.
    //  Input: Two dates given by the user in the format YYYY-MM-DD.
    //  Expected Output: An integer showcasing the difference in days between the two dates.
    private static void daysBetween(Scanner scanner) {

        System.out.println("Introduceti prima data: ");
        String date1 = scanner.nextLine();

        System.out.println("Introduceti a doua data: ");
        String date2 = scanner.nextLine();

        LocalDate fdate = LocalDate.parse(date1);
        LocalDate sdate = LocalDate.parse(date2);

        long daysBetween = ChronoUnit.DAYS.between(sdate, fdate);

        System.out.println("Diferenta exprimata in zile intre cele 2 date este: " + Math.abs(daysBetween));

    }

    //  Date Authenticator
    //  Description: Engineer a method named isValidDate that captures a date string from the console and assesses if it conforms to a valid date format (YYYY-MM-DD).
    //  The method should also consider leap years when validating February dates.
    //  Input: A string of a date from the console.
    //  Expected Output:
    //  true if the input adheres to the date format and denotes a genuine date.
    //  false if otherwise.
    private static void isValidDate(Scanner scanner) {

        System.out.println("Introduceti data: ");
        String date = scanner.nextLine();

        try {
            LocalDate correctDate = LocalDate.parse(date);
            System.out.println("Rezultat: " + true);

        } catch (DateTimeParseException e) {
            System.out.println("Rezultat: " + false);
        }
    }

    //  Duration Since
    //  Description: Construct a method dubbed elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present.
    //  Input: A time given in the format HH:MM:SS.
    //  Expected Output: The time span given as X hours, Y minutes, Z seconds.
    private static void elapsedTimeSince(Scanner scanner) {

        System.out.println("Introduceti timpul anterior: ");
        String time = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        try {
            LocalTime priorTime = LocalTime.parse(time, formatter);
            LocalTime actualTime = LocalTime.now();

            String actualTimeCorrect = actualTime.format(formatter);

            Duration duration = Duration.between(actualTime, priorTime);

            long ora = Math.abs(duration.toHours());
            long minut = Math.abs(duration.toMinutes() % 60); // se face modulo 60, deoarece returnează numărul de minute rămas după ce se scad orele complete.
            long secunda = Math.abs(duration.toSeconds() % 60); // la fel ca mai sus

            System.out.println("Durata timpului de la " + priorTime + " pana la " + actualTimeCorrect + " este:");
            System.out.println("Ore: " + ora);
            System.out.println("Minute: " + minut);
            System.out.println("Secunde: " + secunda);
        } catch (DateTimeParseException e) {
            System.out.println("Format ora incorect!");
        }
    }

    //  Time Conversion Across Zones
    //  Description: Develop a method named convertToTimeZone that collects a date and time from the console in the pattern YYYY-MM-DD HH:MM:SS and a timezone (like "EST", "PST"). The objective is to transmute the specified date and time to align with the provided timezone and then showcase the result.
    //  Input:
    //  Date and time structured as YYYY-MM-DD HH:MM:SS.
    //  A string indicating the timezone (e.g., "EST").
    //  Expected Output: The recalibrated date and time synchronized with the inputted timezone.
    private static void convertToTimeZone(Scanner scanner) {

        System.out.println("Introduceti data si ora: ");

        String dateAndTime = scanner.nextLine();

        System.out.println("Introduceti timezone-ul: ");

        String timeZone = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateAndTime, formatter);
            ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.systemDefault());

            ZoneId zoneId;
            try {
                zoneId = TimeZone.getTimeZone(timeZone).toZoneId();
                ZonedDateTime conversie = zonedDateTime.withZoneSameInstant(zoneId);

                System.out.println("Conversia " + zonedDateTime.format(formatter) + " din " + ZoneId.systemDefault() + " la timezone-ul " + timeZone + " este: " + conversie.format(formatter));
            } catch (ZoneRulesException e) {
                System.out.println("Format timezone gresit!");
            }

        } catch (DateTimeParseException e) {
            System.out.println("Format gresit data si ora!");
        } catch (ZoneRulesException e) {
            System.out.println("Format timezone gresit!");
        }
    }
}
