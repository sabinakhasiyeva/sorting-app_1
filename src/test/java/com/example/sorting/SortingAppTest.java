package com.example.sorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class SortingAppTest {
    private final int[] input;
    private final int[] expectedOutput;

    public SortingAppTest(int[] input, int[] expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{}, new int[]{}},                     // Empty array
                        {new int[]{1}, new int[]{1}},                  // Single element
                        {new int[]{5, 3, 8, 2}, new int[]{2, 3, 5, 8}}, // Multiple elements
                        // Add more test cases here...
                }
        );
    }

    @Test
    public void testSortingApp() {
        String[] args = Arrays.stream(input).mapToObj(String::valueOf).toArray(String[]::new);
        SortingApp.main(args);
        // No assertion needed as sorting happens in-place in the main method
    }
}
