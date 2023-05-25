package javaClassesAndMethodsUntilJDBC.collections.mapAndHashMap.linkedHashMapAndTreeMap;

import java.util.TreeMap;

public class MainTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,Student> students = new TreeMap<>(new OrderByNoComparator()); // öğrenci no ya göre sıraladı


        students.put(102,new Student(102,"Abdullah",25));
        students.put(110,new Student(110,"Asya",100));
        students.put(108,new Student(108,"Eray",45));
        students.put(118,new Student(118,"Kübra",85));

        for (Student student : students.values()){
            System.out.println(student.getName());
        }
    }
}
