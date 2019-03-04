package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testNullaryConstructor(){
        // Given
        Long expected = 0L;

        // When
        Person p = new Person();
        Long actual = p.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIDPassedConstructor(){
        // Given
        Long expected = 550L;

        // When
        Person p = new Person(expected);
        Long actual = p.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
