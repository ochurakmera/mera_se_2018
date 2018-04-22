package zudin.task3;

public abstract class Person {
    private static int personCount = 0;

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String country;

    public Person(String firstName, String lastName, String dateOfBirth, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;

        personCount = personCount + 1;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastrname() {
        return lastName;
    }

    public void setLastrname(String lastrname) {
        this.lastName = lastrname;
    }

    public String getDateofBirth() {
        return dateOfBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateOfBirth = dateofBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
