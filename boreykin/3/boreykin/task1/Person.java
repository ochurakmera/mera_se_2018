/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

/**
 *
 * @author flyer
 */
public class Person 
{
    private static int personCount = 0;
    private static final String DEFAULT_FIRST_NAME = "DefaultFirstName";
    private static final String DEFAULT_LAST_NAME = "DefaultLastName";
    private static final int DEFAULT_BIRTH_YEAR = 0;
    private static final String DEFAULT_COUNTRY = "Nowhere";
    
    private String firstame;
    private String lastName;
    private int birthYear;
    private String country;
    
    public Person()
    {
        personCount++;
        this.firstame = DEFAULT_FIRST_NAME;
        this.lastName = DEFAULT_LAST_NAME;
        this.birthYear = DEFAULT_BIRTH_YEAR;
        this.country = DEFAULT_COUNTRY;
    }
    
    public Person(Person person)
    {
        personCount++;
        this.firstame = person.firstame;
        this.lastName = person.lastName;
        this.birthYear = person.birthYear;
        this.country = person.country;
    }
    
    public Person(String firstName, String lastName, int birthYear, String country)
    {
        personCount++;
        this.firstame = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.country = country;
    }

    /**
     * @return the personCount
     */
    public static int getPersonCount() {
        return personCount;
    }

    /**
     * @return the firstame
     */
    public String getFirstame() {
        return firstame;
    }

    /**
     * @param firstame the firstame to set
     */
    public void setFirstame(String firstame) {
        this.firstame = firstame;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
