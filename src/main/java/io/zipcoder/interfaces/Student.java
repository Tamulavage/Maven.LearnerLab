package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private Double totalStudyTime;

    public Student(){
        this.totalStudyTime = 0d;
    }

    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime(){
        return this.totalStudyTime;
    }
}
