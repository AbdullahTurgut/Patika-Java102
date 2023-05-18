import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueHackerRank {
    static class Student {
        // Öğrenci sınıfı için gerekli değişken ve metotlar
        private final int id;
        private final String name;
        private final double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCGPA() {
            return cgpa;
        }
    }

    static class Priorities {
        //The Priorities class should implement the method
        // List<Student> getStudents(List<String> events) to process
        // all the given events and return all the students yet to be served in the priority order.
        private final PriorityQueue<Student> queue = new PriorityQueue<>(
                Comparator.comparing(Student::getCGPA).reversed() // önce nota göre sırala
                        .thenComparing(Student::getName) // sonra isime göre sırala
                        .thenComparing(Student::getID)); // sonra id ye göre sırala

        public List<Student> getStudents(List<String> events) {
            events.forEach((event) -> {
                if (event.equals("SERVED")) {
                    queue.poll(); // eğer SERVED girilmiş ise kuyruktan çıkar
                } else {
                    String[] details = event.split(" "); // boşluklardan ayır ve String diziye atama yap
                    // dizinin son indexi id,1.indexi name,2.indexi not değeri olarak kuyruğa student objesi ekle
                    queue.add(new Student(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
                }
            });

            List<Student> students = new ArrayList<>(); // students listesi initialize et
            while (!queue.isEmpty()) {
                students.add(queue.poll()); // kuyruk boş değil ise kuyruktan bir eleman çıkar öğrencilere ekle
            }

            return students;
        }
    }

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());// n değeri 12
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) { // 12 kez input değeri girmek
            String event = scan.nextLine();
            events.add(event); // events listesine atama yapıyoruz
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

