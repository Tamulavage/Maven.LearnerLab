package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testNullaryContstructor(){
        // Given
        Double expected = 0d;

        // When
        Student student = new Student(1l);
        Double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearnMethod(){
        // Given
        Double expected = 1d;
        Student student = new Student(1l);

        // When
       student.learn(1d);
       Double actual = student.getTotalStudyTime();

       // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLearnMethodTwice(){
        // Given
        Double expected = 2d;
        Student student = new Student(1l);

        // When
        student.learn(1d);
        student.learn(1d);
        Double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testImplementation(){
        // Given
        Student student = new Student(1l);

        // When

        // Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        // Given
        Student student = new Student(1l);

        // When

        // Then
        Assert.assertTrue(student instanceof Person);
    }
}
