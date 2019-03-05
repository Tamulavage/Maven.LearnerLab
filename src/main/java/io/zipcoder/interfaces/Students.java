package io.zipcoder.interfaces;

public final class Students extends  People{
    private  static final Students instance = new Students();

    public static Students getInstance() {
        return instance;
    }

    private Students() {
        String[] names = {"one","two","three"};
        People people = new People();
        for(int i = 0; i<names.length; i++){
            Student student = new Student(i);
            student.setName(names[i]);
            people.add(student);
        }
    }
}
