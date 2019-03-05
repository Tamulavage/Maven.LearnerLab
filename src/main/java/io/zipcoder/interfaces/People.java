package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Map;

public class People {
    
    ArrayList<Person> personList;
    
    public People(){
        personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Integer getCount() {
        return personList.size();
    }

    public void remove(Person person) {
        this.personList.remove(person);
    }

    public void remove(Long id) {

        this.personList.remove(findById(id));
    }

    public Person findById(Long id) {
        Person person = null;
        for (Person ele: personList) {
            if(id.equals(ele.getId()))
            {
                person = ele;
            }
        }
        return person;
    }

    public void removeAll() {
        personList.clear();
    }

    public Person[] getArray(){
         Person[]  p = new Person[personList.size()];
         p = personList.toArray(p);
         return p;
    }
}
