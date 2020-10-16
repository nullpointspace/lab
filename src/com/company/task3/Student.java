package com.company.task3;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    protected Double averageMark;

    public Integer getScholarship(){
        if (averageMark == 5.0) {
            return 100;
        } else {
            return 80;
        }
    }
}
