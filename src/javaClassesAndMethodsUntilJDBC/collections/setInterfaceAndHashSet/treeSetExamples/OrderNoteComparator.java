package javaClassesAndMethodsUntilJDBC.collections.setInterfaceAndHashSet.treeSetExamples;

import java.util.Comparator;

public class OrderNoteComparator implements Comparator<Student> {

    // sıralama yapabilmek için negatif deger gelmesi durumunda
    // o2 ye göre sıralama yapacaktır
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote() - o2.getNote();
    }
}
