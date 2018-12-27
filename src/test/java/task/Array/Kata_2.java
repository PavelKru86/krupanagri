package task.Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kata_2
{

    public static int[] countPositivesSumNegatives(int[] input) throws IOException
    {
        int i = 0;
        int sum = 0;
        int status = 0;

        if (input == null)
            input = new int[]{};
        for (Integer x : input) {
            if (x < 0) {
                status = 1;
                sum = x + sum;
            }
            else if (x > 0) {
                status = 1;
                i++;

            }

        }
        if (status == 1)
            input = new int[]{i, sum};

        return input; //return an array with count of positives and sum of negatives
    }
}
