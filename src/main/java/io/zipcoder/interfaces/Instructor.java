package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public void lecture(Learner[] students, double numberOfHours) {
        double increaseBy  =students.length/numberOfHours;
        for(Learner ele : students){
            ele.learn(increaseBy);
        }
    }

    public void teach(Learner student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    public Instructor (long id){
        super(id);
    }


}
