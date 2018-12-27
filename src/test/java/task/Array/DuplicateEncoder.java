package task.Array;

import java.util.*;

public class DuplicateEncoder {
    static String encode(String word){
        int i = 0;
        List list = new ArrayList();
        List listRes = new ArrayList();
        Map<String,Integer> map = new HashMap<>();
        String[] str = word.split("");
       // char[] str = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(word);
       // list.add(str);


        for (String res : str) {
          //  list.add(res);
            if (list.contains(res)) {
                //map.replace(, res, ")");
                //int g = map.get(res);
                //i++;
                //map.put(res,++g);
               // listRes.add(")");
                //listRes.add(res, ")");
            }

            else {
                map.put(res,1);
                listRes.add("(");
                list.add(res);
            }


        }
      /*  Iterator it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String,Integer> pair = (Map.Entry) it.next();
            if (pair.getValue() > 1)
                map.put(")", 1);
            else
                map.put("(", 1);
            it.remove();
        }*/
      /*  for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                map.put(")", 1);
            else
                map.put("(", 1);

        }*/

        for (Object ch : map.keySet()) {
            stringBuilder.append(ch);
        }


        String res = stringBuilder.toString();
        return res;
        /*    res.replaceAll("^+", "null");
        return word;
        String[] str = word.split("");
        Map<String,Integer> map = new HashMap<>();*/
       /* for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(str))


        }*/
      /* for (String res : str) {
           if (map.containsKey(res))
               map.put()
           else
               res = "(";
       }*/
    }


}