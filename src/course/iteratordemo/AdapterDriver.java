package course.iteratordemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class AdapterDriver {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");


        System.out.println("First way to iterate over enumeration");
        for (Enumeration<String> enumeration = new IteratorEnumeration<>(list.iterator()); enumeration.hasMoreElements(); ) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("\nSecond way to iterate over enumeration");
        Enumeration<String> enumeration = new IteratorEnumeration<>(list.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
