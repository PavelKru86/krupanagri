package task.Array;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class DuplicateEncoder {
    static String encode(String word){
        int i = 0;
        word = word.toLowerCase();
        List list = new ArrayList();
        List listRes = new ArrayList();
        LinkedHashMap<String,String> map = new LinkedHashMap<String, String>();
        String[] str = word.split("");
       // char[] str = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
       // list.add(str);
        for (String res : str) {
            i++;
            map.put(""+i, res);
        }

        LinkedHashMap<String, String> copy = new LinkedHashMap<String, String>(map); // создаём копию массива
        for (Map.Entry<String, String> pair : copy.entrySet()){          // итератор ?
            int freqeuncy = Collections.frequency(copy.values(), pair.getValue());  // применяем метод Collections.frequency, находит повторения в виде числа > 1
            if (freqeuncy > 1){
                removeItemFromMapByValue(map, pair.getValue()); // если такие имеются то передаём в метод для удаления.
            }
            else {

            }

        }
   //  Collections.
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
    //  int x = 0;


     /*   word = word.toLowerCase();

       // Map<Integer, String> map2 = new LinkedHashMap<>();
        String[] str = word.split("");
        List list = new ArrayList(Arrays.asList(str));
        Map<Integer, List> map = new LinkedHashMap<>();


        for (Map.Entry<Integer, List> entry : map.entrySet()) {
            int freq = Collections.frequency(map.values(),entry.getValue());
            if (freq > 1)
            {
                System.out.println("fuck");
            }
        }*/
       // Map<String, map> map2 = new HashMap<>()
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

    public static void removeItemFromMapByValue(LinkedHashMap<String, String> map, String value)  // тут магия
    {
        LinkedHashMap<String, String> copy = new LinkedHashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
               // map.remove(pair.getKey());
                map.put(pair.getKey(),")");
        }
    }


}