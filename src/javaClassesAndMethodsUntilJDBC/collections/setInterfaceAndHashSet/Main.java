package javaClassesAndMethodsUntilJDBC.collections.setInterfaceAndHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // HashSet null değeride tutabilir.
        HashSet<Integer> hashSet = new HashSet<>(); // initialize hashSet - Boyut vermemize gerek yok
        hashSet.add(10); // veri ekleme işlemi
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(null);

        // Iterator<> kullanarak gezinme
        Iterator<Integer> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // geriye bir sonraki objeyi döndürür
        }




//        System.out.println(hashSet.contains(10)); // nesne var mı diye kontrol
//        hashSet.remove(10); // silme işlemi
//        hashSet.clear(); // hepsini temizler
//        for (Integer sayi : hashSet){
//            // çıktı hep girilen sırayla olmayabilir
//            System.out.println(sayi);
//        }

    }
}
