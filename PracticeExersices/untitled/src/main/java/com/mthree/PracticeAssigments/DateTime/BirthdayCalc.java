package com.mthree.PracticeAssigments.DateTime;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayCalc {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("What's your birthday? dd-mm-yyyy:");
        LocalDate usrBday = LocalDate.parse(sc.nextLine(), formatter);
        System.out.println("Thats means you were born on a " + usrBday.getDayOfWeek());
        LocalDate currentYearBday = usrBday.withYear(LocalDate.now().getYear());
        System.out.println("This year it falls on a " + currentYearBday.getDayOfWeek());
        if (currentYearBday.isBefore(LocalDate.now())) {
            currentYearBday = currentYearBday.plusYears(1);
        }
        long daysUntil = ChronoUnit.DAYS.between(LocalDate.now(), currentYearBday);
        System.out.println("And since today is " + LocalDate.now() + ", theres only " + daysUntil + " days till the next one!");
        System.out.println("bet your excited to be turning " + usrBday.until(currentYearBday, ChronoUnit.YEARS) );
    }



}
