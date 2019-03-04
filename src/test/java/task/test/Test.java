package task.test;

import javax.sql.rowset.spi.SyncResolver;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    interface I {
        void a(Number n);
    }

    static class A implements I {

        public void a(Number n) {
            System.out.println("number");
        }

        public void a(Double n) {
            System.out.println("double");
        }
    }

    public static void main(String[] args) {

        I i = new A();
        Double d = new Double(12d);
        i.a(d);
    }
}
/*
public class Test{
    int GetValue()
    {
        return (true ? 1 : 0);
    }

    public static void main(String[] args)  {
        Test obj = new Test();
        obj.GetValue();
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("a", 3);
        hashMap.put("c", 3);
        hashMap.put("a", 3);
        hashMap.put("ac", 3);
        hashMap.put("bc", 3);
        hashMap.put("fa", 3);
        List<String> list = Testrrays.asList("a", "b", "f", "e");
        List<String> newList = list.stream().sorted((x,y)-> x.compareTo("b")).filter(x->x.equals("a")).collect(Collectors.toList());
        System.out.println(newList);
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("hello world!");
        Predicate<Integer> predicate = x-> x.equals(5);
        System.out.println(predicate.test(10));
       */
/* Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.print("sdfsf");
            }
        };
        runnable.run();*//*


        Runnable runnable1 = () -> System.out.println("sdf");

        Runnable runnable2 = System.out::println;


        Predicate<Integer> predicate1 = Integer.valueOf(5)::equals;
        Predicate<Integer> predicate2 = x -> x.equals(5);
        System.out.println(predicate1.test(5));

    }

    private String a(int a, String b) {
        return null;
    }

    public Integer a(String b, int a) {
        return null;
    }




}*/
