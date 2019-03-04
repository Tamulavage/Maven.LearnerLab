package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        // Given
        Instructor instructor = new Instructor();

        // When

        // Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        // Given
        Instructor instructor = new Instructor();

        // When

        // Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        // Given
        Instructor instructor = new Instructor();
        Student student = new Student();
        Double expected = 1d;

        // When
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        // Given
        Instructor instructor = new Instructor();
        Student student1 = new Student();
        Student student2 = new Student();
        Student[] students = {student1, student2};
        Double expected = 1d;
        Double hourSentIn = 2d;
        Double original1 = student1.getTotalStudyTime();
        Double original2 = student2.getTotalStudyTime();

        // When
        instructor.lecture(students, hourSentIn);
        Double actual1 = student1.getTotalStudyTime();
        Double actual2 = student2.getTotalStudyTime();
        actual1 -= original1;
        actual2 -= original2;

        // Then
        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);
    }

}
