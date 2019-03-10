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



        teacher.lecture(students.getArray() , numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){

        Instructor instructor = (Instructor) instructors.findById(id);

        instructor.lecture(students.getArray(), numberOfHours);
    }
}
