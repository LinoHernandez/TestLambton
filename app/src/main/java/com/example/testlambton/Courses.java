package com.example.testlambton;

public class Courses {
    private String courseName;
    private String courseFee;
    private String courseHour;

    public Courses(String courseName, String courseFee, String courseHour) {
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.courseHour = courseHour;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public String getCourseHour() {
        return courseHour;
    }
}
