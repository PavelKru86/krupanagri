package task.test;

/*public class Test {
    public static void main(String[] arg) {
        Test test = new A();
        test.print(1);
    }

    public void print(String b) {
        System.out.println("Test");
    }
}

class A extends Test {
    public void print(int x) {
        System.out.println("A");
    }
}*/

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Test {
    Collection c = new HashSet();
    public static void main(String[] arg) {
        Test test = new Test();

    }


    public Test() {
        print(c);
    }

    public void print(Collection c) {
        System.out.println("Collection");
    }

    public void print(Set s) {
        System.out.println("Set");
    }

    public void print(HashSet hs) {
        System.out.println("HashSet");
    }
}
