package task.Array;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TwoListTest {
    @Test
    public void TwoListTestOne() {
        final List<String> listOne = new ArrayList<>();
        final List<String> listTwo = new ArrayList<>();

        listOne.add("apple");
        listOne.add("potatoes");
        listOne.add("oranges");
        listOne.add("Coffee");
        listOne.add("banana");
        listOne.add("tomatoes");
        listOne.add("cucumber");

        listTwo.add("oranges");
        listTwo.add("car");
        listTwo.add("Coffee");
        listTwo.add("bus");
        listTwo.add("banana");
        assertEquals(Arrays.asList("oranges", "Coffee", "banana"), TwoList.generalTwoList(listOne,listTwo));
        //assertEquals(Arrays.asList("Ruby", "Python"), MyLanguages.myLanguages(map1));
    }
}
