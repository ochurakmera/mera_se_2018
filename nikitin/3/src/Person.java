package src;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class Person {
    private String firstName;
    private String secondName;
    private Date birthday;
    private String country;
    private static int counter = 0;

    Person(String firstName, String secondName, Date birthday, String country) {
        this.firstName  = firstName;
        this.secondName = secondName;
        this.birthday   = birthday;
        this.country    = country;
        counter++;
    }

    public static void printCounter() {
        System.out.println("Total persons: " + counter);
    }

    public void printBio() {
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        System.out.println(String.format("Autor: %s %s", this.firstName, this.secondName));
        System.out.println("\tBirthday: " + sdf.format(this.birthday));
        System.out.println("\tCountry: " + this.country);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
