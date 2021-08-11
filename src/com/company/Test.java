package com.company;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;


public class Test {
    public static void main(String[] args) {
        Instant current = Instant.now();

        System.out.println(current.plusSeconds(50));

//        If advertisement duration is 2 days or less: send no email
//        If advertisement duration is between 2 and 5 days: send email on last day of advertisement
//        If advertisement duration is 6 days or more: send email 3 days before end date
    }
}
