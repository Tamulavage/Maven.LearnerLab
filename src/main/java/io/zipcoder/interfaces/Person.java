package io.zipcoder.interfaces;

public class Person {

    private final Long id;
    private String name;

    public Person(){
        this.id = 0L;
    }

    public Person(Long lngInput){
        this.id = lngInput;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.getName();
    }


}
