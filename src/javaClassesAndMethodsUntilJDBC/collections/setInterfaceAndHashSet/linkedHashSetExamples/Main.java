package javaClassesAndMethodsUntilJDBC.collections.setInterfaceAndHashSet.linkedHashSetExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(20);
        linkedHashSet.add(10);
        linkedHashSet.add(10);
        linkedHashSet.add(30);

        Iterator<Integer> itr = linkedHashSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next()); // girilen sıra ile verir değeri ve tekrarlanmaz
        }
    }
}
