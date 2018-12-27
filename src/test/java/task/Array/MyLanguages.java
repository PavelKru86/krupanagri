package task.Array;

import java.util.*;
import java.util.stream.Collectors;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        //List<String> list = new ArrayList<>();
        /*for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() >= 60) {
                list.add(entry.getKey());
            }

        }

        Collections.sort(list, Collections.reverseOrder());*/

        List<String> list = results.entrySet().stream().filter(x->x.getValue()>=60)
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(x -> x.getKey())
                .collect(Collectors.toList());



       /* Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");

        // split a map into 2 List
        List<Integer> resultSortedKey = new ArrayList<>();
        List<String> resultValues = map.entrySet().stream()
                //sort a Map by key and stored in resultSortedKey
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .map(x -> x.getValue())
                // filter banana and return it to resultValues
                .filter(x -> !"banana".equalsIgnoreCase(x))
                .collect(Collectors.toList());*/
        return list;
    }
}
