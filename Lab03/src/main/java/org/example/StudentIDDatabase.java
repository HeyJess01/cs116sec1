package main.java.org.example;

public class StudentIDDatabase {
    private int numberOfIDs = 0;
    private int MAX_DATABASE_SIZE = 0;
    private StudentID[] studentIDs;

    public void IDDatabase(){
        MAX_DATABASE_SIZE = 5;
        studentIDs = new StudentID[MAX_DATABASE_SIZE];
    }

    public void IDDatabase(int databaseSize){
        if (databaseSize > 0){
            MAX_DATABASE_SIZE = databaseSize;
            studentIDs = new StudentID[MAX_DATABASE_SIZE];
        } else {
            IDDatabase();
        }
    }
    public int getNumberOfIDs() {
        return numberOfIDs;
    }

    public boolean addStudent(StudentID studentID){
        if (numberOfIDs > MAX_DATABASE_SIZE){
            System.out.println("Database is full");
            return false;
        } else {
            if ((studentID == null)){
                System.out.println("Student ID is null or blank");
                return false;
            } else {
                return true;
            }
        }

    }
}
