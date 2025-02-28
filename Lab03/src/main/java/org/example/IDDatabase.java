package main.java.org.example;

import java.util.Objects;

public class IDDatabase {
    private int numberOfIDs = 0;
    private int MAX_DATABASE_SIZE = 0;
    private StudentID[] IDList;

    public IDDatabase(){
        MAX_DATABASE_SIZE = 5;
        IDList = new StudentID[MAX_DATABASE_SIZE];
    }

    public IDDatabase(int databaseSize){
        if (databaseSize > 0){
            MAX_DATABASE_SIZE = databaseSize;
            IDList = new StudentID[MAX_DATABASE_SIZE];
        } else {
            new IDDatabase();
        }
    }
    public int getNumberOfIDs() {
        return numberOfIDs;
    }

    public boolean add(StudentID studentID){
        if ((studentID != null) && (numberOfIDs <= MAX_DATABASE_SIZE - 1) && (!Objects.equals(studentID.getANumber(), "INVALID"))){
            IDList [numberOfIDs] = studentID;
            numberOfIDs++;
            return true;
        } else {
            return false;
        }
    }

    public void listNames(){
        for (int i = 0; i < numberOfIDs; i++){
            System.out.println("ID" + i + ": " + IDList[i].getStudentFirstName() + " " + IDList[i].getStudentLastName());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfIDs; i++) {
            sb.append("\n").append(IDList[i].toString());
        }
        return sb.toString();
    }
}
