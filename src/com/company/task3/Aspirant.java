package com.company.task3;

public class Aspirant extends Student {

    @Override
    public Integer getScholarship() {
        if (averageMark == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }
}
