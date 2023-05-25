package javaClassesAndMethodsUntilJDBC.collections.setInterfaceAndHashSet;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSetHackerRank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet();
        int count = 0; // sayac initialize et

        int numCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCases; i++) { // 5 kere dönmesi için
            if (hashSet.add(scanner.nextLine())) { // girilen stringleri listeye aat
                count++; // sayac 1 arttır
            }
            System.out.println(count); // her döngü sonunda sayac bastır
        }
    }
}
