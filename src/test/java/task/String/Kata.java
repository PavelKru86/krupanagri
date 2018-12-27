package task.String;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata
{
    public static String reverseWords(final String original)
    {
        /*Pattern pattern = Pattern.compile();
        Matcher matcher = pattern.matcher(original);*/
     /*   String finish = null;
        Matcher matcher = Pattern.compile("^[a-z]+$").matcher(original);
        while(matcher.find()) {
            finish = original.replaceAll(matcher.group(),matcher.group().toUpperCase());
        }
        return finish;*/
      /*  for (String fin : original.split(" ")) {
            fin.
        }*/

        String end = "";
        String end_end = "";
        //stringBuilder.reverse();
        for (String fin : original.split(" ")) {
            StringBuilder stringBuilder = new StringBuilder(fin);
            end += " " + stringBuilder.reverse().toString();
        }
        end_end = end.replaceFirst(" ", "");
        return end_end;



        // Have at it
    }
}