package javaClassesAndMethodsUntilJDBC.collections.setInterfaceAndHashSet.treeSetExamples;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // bu şekilde hata alınır. Sıralama değeri vermek gerekiyor
//        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator()); // küçükten büyüğe sırala
//        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed()); // büyükten küçüğe sırala
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());

        students.add(new Student("Abdullah", 20));
        students.add(new Student("Abdullah", 20));
        students.add(new Student("Asya", 90));
        students.add(new Student("Eray", 70));
        students.add(new Student("Kübra", 95));
        students.add(new Student("Zehra", 80));

        for (Student student : students)
            System.out.println(student.getName());


    }
}
