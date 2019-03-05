package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructorSingleton {

    @Test
    public void TestInstructorSingleton(){
        // Given
        List<String> expected = Arrays.asList("four","five", "six");

        // When
        for(Person ele: Instructors.getInstance())
        {
            // then
            Assert.assertTrue(expected.contains(ele.getName()));
        }

    }
}
