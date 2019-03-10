package io.zipcoder.interfaces;


public class ZipCodeWilmington {

    private static ZipCodeWilmington instance = new ZipCodeWilmington();
    private Students students;// = Students.getInstance() ;
    private Instructors instructors; //= Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {

        return instance;
    }

    private ZipCodeWilmington() {
        this.students = Students.getInstance() ;
        this.instructors = Instructors.getInstance();
    }

    public Instructors getInstructors(){
        return this.instructors;
    }

    public Students getStudents(){
        return this.students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){

        Person[] person = students.getArray();
        Learner[] learners = new Learner[person.length];
        for(int i =0; i<person.length; i++){
            learners[i]=(Learner) person[i];
        }

        teacher.lecture(learners , numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){

        Instructor instructor = (Instructor) instructors.findById(id);
        Person[] person = students.getArray();
        Learner[] learners = new Learner[person.length];
        for(int i =0; i<person.length; i++){
            learners[i]=(Learner) person[i];
        }

        instructor.lecture(learners, numberOfHours);
    }
}
