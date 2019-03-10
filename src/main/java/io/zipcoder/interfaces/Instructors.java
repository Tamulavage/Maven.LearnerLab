package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static Instructors instance = new Instructors();

    public static Instructors getInstance() {
        return instance;
    }

    private Instructors() {
        String[] names = {"four", "five", "six"};
        for (int i = 0; i < names.length; i++) {
            Instructor instructor = new Instructor(i);
            instructor.setName(names[i]);
            super.add(instructor);
        }
    }
}
