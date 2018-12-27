package task.Array;

import java.util.LinkedList;
import java.util.List;

public class Kata_3 {

    public static String stringify(Node list) {
        // Your code here.
        List linkedList = new LinkedList();
        if (list == null)
            return "null";
        for (int i = 0; ; i++) {


            linkedList.add(i, list.getData());


            if (list.getNext() == null)
                break;

            list = list.getNext();
        }


        String res = getString(linkedList);

        return res;
    }

    public static String getString(List list)
    {
        StringBuilder builder = new StringBuilder(list.size());
        for(Object ch: list)
        {
            builder.append(ch+ " -> ");
        }
        return builder.toString() + "null";
    }

}
