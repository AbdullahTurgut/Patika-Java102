package ClassRelationships;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Abdullah", "Turgut", "123", "AA", 85);
        Student student1 = new Student("Asya", "Turgut", "456", "BB", 85);
        Student student2 = new Student("Kodluyoruz", "Java102", "12312", "CC", 85);

        Instructor teacher = new Instructor("Mahmut", "Çetindağ", "CENG");


        // Kalıtım (Inheritance) => is a 
        // Composition , Aggretation
        // Course has a Instructor ( Sınıfın bir öğretmeni vardır.)
        Course mat = new Course("MAT101", "MAT", teacher);

        System.out.println(mat.getInstructor().getName());


//        Student[] stu = {student1, student, student2};
//        System.out.println("Ortalama : " + mat.calcAverage(stu));
    }
}
