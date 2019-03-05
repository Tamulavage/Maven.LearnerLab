package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAddOne(){
        // Given
        People people = new People();
        Person person = new Person(100l);
        Integer expected = 1;

        // When
        people.add(person);
        Integer actual = people.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddTwo(){
        // Given
        People people = new People();
        Person person = new Person(100l);
        Person person2 = new Person(101l);
        Integer expected = 2;

        // When
        people.add(person);
        people.add(person2);
        Integer actual = people.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveExists(){

        //Given
        People people = new People();
        Person person = new Person( 200l);
        Integer expected = 0;
        people.add(person);

        // When
        people.remove(person);
        Integer actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemoveNotExists(){
        //Given
        People people = new People();
        Person person = new Person( 200l);
        Integer expected = 0;

        // When
        people.remove(person);
        Integer actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveExistsWithThree(){

        //Given
        People people = new People();
        Person person = new Person( 200l);
        Person person2 = new Person( 201l);
        Person person3 = new Person( 202l);
        Integer expected = 2;
        people.add(person);
        people.add(person2);
        people.add(person3);

        // When
        people.remove(person);
        Integer actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemoveBNyIdExistsWithThree(){

        //Given
        People people = new People();
        Person person = new Person( 200l);
        Person person2 = new Person( 201l);
        Person person3 = new Person( 202l);
        Integer expected = 2;
        people.add(person);
        people.add(person2);
        people.add(person3);

        // When
        people.remove(201l);
        Integer actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemoveAll(){

        //Given
        People people = new People();
        Person person = new Person( 200l);
        Person person2 = new Person( 201l);
        Person person3 = new Person( 202l);
        Integer expected = 0;
        people.add(person);
        people.add(person2);
        people.add(person3);

        // When
        people.removeAll();
        Integer actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindByIdExists(){
        //Given
        People people = new People();
        Long id = 999l;
        Person expected = new Person( id);
        people.add(expected);

        // When
        Person actual = people.findById(id);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindByIdNotExists(){
        //Given
        People people = new People();
        Long id = 999l;
        Person person = new Person( 100l);
        people.add(person);

        // When
        Person actual = people.findById(id);

        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void testGerArray(){
        // Given
        People people = new People();
        Person person = new Person(100l);
        Person person2 = new Person(101l);
        Person[] expected = {person, person2};

        // When
        people.add(person);
        people.add(person2);
        Person[] actual = people.getArray();

        // Then
        Assert.assertArrayEquals(expected, actual);

    }

}
