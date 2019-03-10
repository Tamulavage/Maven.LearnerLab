package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public abstract class People <E extends Person> implements Iterable <E>{
    
     ArrayList<E> personList;
    
    public People(){
        personList = new ArrayList<E>();
    }

    public void add(E person) {
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

    public  E findById(Long id) {
        E person = null;
        for (E ele: personList) {
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

    public abstract E[] getArray();


    public  Iterator<E> iterator()
   {return personList.iterator(); }

}
