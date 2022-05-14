package pl.codegym.task.task20.task2020;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.logging.Logger;

/* 
Serializowanie people
*/

public class Solution {

    public static class Person implements Serializable {

        String firstName;
        String lastName;
      transient   String fullName;
        transient  final String greeting;
        String country;
        Sex sex;
        transient  PrintStream outputStream;
        transient  Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Cześć, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}