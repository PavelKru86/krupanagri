package task.Array;

import java.util.ArrayList;
import java.util.List;

class Kata {
    static String noSpace(final String x) {
        List list = new ArrayList();
        //List<String> list_res = new ArrayList();
        char[] no_space = x.toCharArray();
        //String[] no_space = x.split("");
        for (char q : no_space) {
            if ((int) q == 32) {

            }
            else
                list.add(q);

        }
        String y = getString(list);
       // list.toString();

        //String y = String.join(",", list);

        //x.split(" ");
        //StringBuilder stringBuilder = new StringBuilder(x);
        //stringBuilder.sp
        return y;
    }

    public static String getString(List list)
    {
        StringBuilder builder = new StringBuilder(list.size());
        for(Object ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }
}
