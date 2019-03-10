package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestZipCodeSingleton {

    @Test
    public void TestZipCodeSingletonHostLectureHostLectureTeacher() {
        // Given

        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Instructors teachersArrayList = zipCodeWilmington.getInstructors();
        Students studentsArrayList = zipCodeWilmington.getStudents();
        Person[] teachers = teachersArrayList.getArray();
        Person[] students = studentsArrayList.getArray();
        int amountOfStudents = students.length;
        int expected = 3;



        // When
        zipCodeWilmington.hostLecture((Teacher) teachers[0], expected);

        // Then
        int actual = 0;
        for (int i = 0; i < amountOfStudents; i++) {
            Student student = (Student) students[i];
            actual += student.getTotalStudyTime();
        }


        Assert.assertEquals(expected,actual);

    }

    @Test
    public void TestZipCodeSingletonHostLectureHostLectureByID() {
        // Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Students studentsArrayList = zipCodeWilmington.getStudents();
        Person[] students = studentsArrayList.getArray();
        int amountOfStudents = students.length;
        int expected = 3;


        // When
        zipCodeWilmington.hostLecture(0l,3);

        // Then
        int actual = 0;
        for (int i = 0; i < amountOfStudents; i++) {
            Student student = (Student) students[i];
            actual += student.getTotalStudyTime();
        }


        // Then
        Assert.assertEquals(expected,actual);

    }

}
