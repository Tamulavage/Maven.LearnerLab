package io.zipcoder.interfaces;


import java.util.ArrayList;

public final class Students extends People<Student> {

    private final static  Students instance = new Students();

    public static Students getInstance() {
        return instance;
    }

    private Students() {
        String[] names = {"one", "two", "three"};

        for (int i = 0; i < names.length; i++) {
            Student student = new Student(i);
            student.setName(names[i]);
            super.add(student);
        }
    }

    public Student[] getArray() {

        Student[] p = new Student[personList.size()];
        p = personList.toArray(p);
        return p;
    }

}
