package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudentsSingleton {

    @Test
    public void testStudentSingleton(){
        // Given
        List<String> expected = Arrays.asList("one","two", "three");

        // When
        for(Person ele: Students.getInstance())
        {
            // then
            Assert.assertTrue(expected.contains(ele.getName()));
        }




    }
}
