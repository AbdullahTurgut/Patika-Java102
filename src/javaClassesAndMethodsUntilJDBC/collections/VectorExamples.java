package javaClassesAndMethodsUntilJDBC.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExamples {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İzmir");

        vector.add(2, "Bolu");
//        System.out.println(vector.contains("Ankara"));

        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // tekrarlı değerleri ve girilen sırayı olduğu gibi bastırır
        }

//        for (String s : vector) {
//            System.out.println(s); // tekrarlı değerleri ve girilen sırayı olduğu gibi bastırır
//        }
    }
}
