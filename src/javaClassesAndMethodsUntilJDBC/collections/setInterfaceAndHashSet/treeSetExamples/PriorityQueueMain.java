package javaClassesAndMethodsUntilJDBC.collections.setInterfaceAndHashSet.treeSetExamples;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        // comparator alabiliyor
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        //}.reversed()); şeklinde bitirirsek tersten bir sıra ile yazar

        priorityQueue.add("Mustafa");
        priorityQueue.add("Çetindağ");
        priorityQueue.add("Ahmet");
        priorityQueue.add("Deniz");

        for (String s : priorityQueue)
            System.out.println(s); // string olduğu için alfabetik sırayla yazdırır
    }
}
