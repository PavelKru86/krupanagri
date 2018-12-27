package task.Array;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

import java.io.IOException;

public class KataTests  {
    @Test
    public void countPositivesSumNegatives_BasicTest() throws IOException {
        int[] expectedResult = new int[] {};
        assertArrayEquals(expectedResult, Kata_2.countPositivesSumNegatives(null));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() throws IOException {
        int[] expectedResult = new int[] {8, -50};
        assertArrayEquals(expectedResult, Kata_2.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
}
