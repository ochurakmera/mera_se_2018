package telukhin.task1;

public class Person {
    private String firstName;
    private String lastName;
    private int year;
    private String country;
    private static int personCount = 0;

    public Person(String firstName, String lastName, int year, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.country = country;
        personCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static int getPersonCount() {
        return personCount;
    }
}
