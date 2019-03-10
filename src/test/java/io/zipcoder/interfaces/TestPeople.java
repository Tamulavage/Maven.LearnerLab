package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    Students people;

    @Before
    public void clearStudentList(){
        people = Students.getInstance();
    }

    @Test
    public void testAddOne(){
        // Given
        Student person = new Student(100l);
        Integer expected = people.getCount()+1;

        // When
        people.add(person);
        Integer actual = people.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddTwo(){
        // Given
        Student person = new Student(100l);
        Student person2 = new Student(101l);
        Integer expected = people.getCount()+2;

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
        Student person = new Student( 200l);
        Integer expected = people.getCount();
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
        Student person = new Student( 200l);
        Integer expected = people.getCount();

        // When
        people.remove(person);
        Integer actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveExistsWithThree(){

        //Given
        Student person = new Student( 200l);
        Student person2 = new Student( 201l);
        Student person3 = new Student( 202l);
        Integer expected = people.getCount()+2;
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
        Student person = new Student( 200l);
        Student person2 = new Student( 201l);
        Student person3 = new Student( 202l);
        Integer expected = people.getCount()+2;
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
        Student person = new Student( 200l);
        Student person2 = new Student( 201l);
        Student person3 = new Student( 202l);
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
        Long id = 999l;
        Student expected = new Student( id);
        people.add(expected);

        // When
        Person actual = people.findById(id);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindByIdNotExists(){
        //Given
        Long id = 999l;
        Student person = new Student( 100l);
        people.add(person);

        // When
        Person actual = people.findById(id);

        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void testGerArray(){
        // Given
        Student person = new Student(100l);
        Student person2 = new Student(101l);
        //Student[] expected = {person, person2};
        Integer expectedSize = people.getCount()+2;

        // When
        people.add(person);
        people.add(person2);
        Person[] actual = people.getArray();
        Integer actualLength = actual.length;

        // Then
        Assert.assertEquals(expectedSize, actualLength);

    }

}
