package collections.mapAndHashMap.linkedHashMapAndTreeMap;


import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

        students.put(102,new Student(102,"Abdullah",25));
        students.put(110,new Student(110,"Asya",100));
        students.put(108,new Student(108,"Eray",45));
        students.put(118,new Student(118,"Kübra",85));

        for (Student student : students.values()){
            System.out.println(student.getName());
        }
    }
}
