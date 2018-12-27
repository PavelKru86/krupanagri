package task.Array;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoubleSort {
    public static Object[] dbSort(Object[] a){


        List list = new ArrayList();
        List list_int = new ArrayList();
        /*for (Object c : a) {

            list.add(c);

        }*/
        for (Object x : a) {
            if (x instanceof String)
                list.add(x);
            else {
                list_int.add(x);
            }
        }


       // Matcher matcher = Pattern.compile("^[a-z]+").matcher(list);
        Collections.sort(list);
        Collections.sort(list_int);
        list_int.addAll(list);

       // Arrays.sort(a);
        //System.out.println(a);

        return list_int.toArray();
    }

   /* @Override
    public int compare(Object o1, Object o2) {
        Integer str1 = (Integer) o1;
        Integer str2 = (Integer) o2;

        if(str1 == str2) return 0;
        if(str1<str2) return 1;
        if(str1>str2) return -1;

        return str2;

    }*/


}
