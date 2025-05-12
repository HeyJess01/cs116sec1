package org.example;

public class StudentID {
    // all attributes cannot be changed -> make them final
    // institution name is the same for all objects -> static
    private static final String INSTITUTION_NAME = "Illinois Tech";
    private final String A_NUMBER;
    private final String FIRST_NAME;
    private final String LAST_NAME;
    // Note the CAPITALS_IN_THE_NAME naming convention for constants

    // Set up the non-default non-parameterized constructor
    // BTW: what will happen if you make it private?
    public StudentID(){
        this.A_NUMBER = "INVALID";
        this.FIRST_NAME = "INVALID";
        this.LAST_NAME = "INVALID";
    }

    // Set up the non-default parameterized constructor
    public StudentID (String givenANumber, String givenFirstName, String givenLastName){
        // Note all "sanity checks" here
        if (givenANumber != null && givenFirstName != null && givenLastName != null){
            if (!givenANumber.equals("") && !givenFirstName.equals("") && !givenLastName.equals("")){
                this.A_NUMBER = givenANumber;
                this.FIRST_NAME = givenFirstName;
                this.LAST_NAME = givenLastName;
            } else {
                this.A_NUMBER = "INVALID";
                this.FIRST_NAME = "INVALID";
                this.LAST_NAME = "INVALID";
            }
        } else {
            this.A_NUMBER = "INVALID";
            this.FIRST_NAME = "INVALID";
            this.LAST_NAME = "INVALID";
        }
    }

// Getters
public String getInstitutionName(){
    return this.INSTITUTION_NAME;
}

    public String getANumber(){
        return this.A_NUMBER;
    }

    public String getFirstName(){
        return this.FIRST_NAME;
    }

    public String getLastName(){
        return this.LAST_NAME;
    }

    // toString method
    public String toString(){
        String output = this.getInstitutionName() + "\n";
        output = output + "Student ID\n";
        output = output + this.getFirstName() + "\n" + this.getLastName() + "\n";
        output = output + this.getANumber() + "\n";


        return output;
    }
}

