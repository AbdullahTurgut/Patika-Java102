package javaClassesAndMethodsUntilJDBC.collections.setInterfaceAndHashSet.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>(); // default capacity 10
        liste.add(10);
        liste.add(2);
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(3);
        liste.add(null);

        Object[] objectArr = liste.toArray();
        Integer[] intArr = liste.toArray(new Integer[0]);
        System.out.println(intArr[0]);
//        List<Integer> liste2 = new ArrayList<>();
//        liste2.addAll(liste);

//        List<Integer> liste2 = liste.subList(2,5); // 2 dahil 5 değil

//        int  removed = liste.remove(0); // 0.indexi siler ve geri döndürür
//        liste.add(3,5); // 3. indexe 5 ekler
//        liste.set(8,7); // 8.indexi 7 yapar
//        System.out.println(liste.indexOf(1)); // girilen değer ilk hangi indexte ise o indexi döndürür
//        System.out.println(liste.get(0)); // get method indexdeki değeri döndürür

//        for (Integer integer : liste) {
//            System.out.println(integer); // girilen sıra ile verir
//        }
//        for (Integer integer : liste2) {
//            System.out.println(integer); // girilen sıra ile verir
//        }
//        System.out.println(liste);
    }
}
