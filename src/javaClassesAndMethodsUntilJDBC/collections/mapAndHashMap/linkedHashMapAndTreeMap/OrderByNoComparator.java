package javaClassesAndMethodsUntilJDBC.collections.mapAndHashMap.linkedHashMapAndTreeMap;

import java.util.Comparator;

//öğrenci no int olduğu için generiği Integer yapabiliriz
public class OrderByNoComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // bu şekilde büyükten küçüğe sıralanacaktır.
    }
}
