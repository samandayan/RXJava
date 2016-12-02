package com.packtpub.retrofit;

public class Student {

    //Variables that are in our json
    private int StudentId;
    private String StudentName;
    private String StudentMarks;

    public static String a;

    static {

    }

    //Getters and setters
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int bookId) {
        this.StudentId = bookId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String name) {
        this.StudentName = name;
    }

    public String getStudentMarks() {
        return StudentMarks;
    }

    public void setStudentMarks(String price) {
        this.StudentMarks = price;
    }

}