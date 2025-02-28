package main.java.org.example;

public class StudentID {
    private static final String institutionName = "Illinois Tech";
    private String ANumber = "";
    private String studentFirstName = "";
    private String studentLastName = "";

    public String getinstitutionName() {
        return institutionName;
    }

    public String getANumber() {
        return ANumber;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }



    public StudentID() {
        ANumber = "INVALID";
        studentFirstName = "INVALID";
        studentLastName = "INVALID";
    }
    public StudentID(String anum, String studentFirst, String studentLast) {
        if (((anum == null) || (anum.isEmpty())) || (studentFirst == null) || studentFirst.isEmpty() || (studentLast == null) || (studentLast.isEmpty())){
            ANumber = "INVALID";
            studentFirstName = "INVALID";
            studentLastName = "INVALID";
        } else {
            ANumber = anum;
            studentFirstName = studentFirst;
            studentLastName = studentLast;
        }
    }
    public String toString() {
        return (institutionName + "\n" + "Student ID" + "\n" + studentFirstName + "\n" +studentLastName + "\n" + ANumber + "\n");
    }
}

