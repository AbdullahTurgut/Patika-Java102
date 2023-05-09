public class Course {
    public String name;
    public String code;
    public int note;

    public Course(String name, String code, int note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void calcAverage(Course[] notes) {
        double total = 0;
        for (Course course : notes) {
            total += course.note;
        }

        double average = total / notes.length;
        System.out.println("Ortalamanız : " + average);
    }
}
