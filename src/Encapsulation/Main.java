package Encapsulation;

public class Main {
    // Encapsulation(Kapsülleme)
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter",150);
        Book lordOfTheRings = new Book("Lord Of The Rings", -111);
        lordOfTheRings.checkPageNumber(-1000);
        System.out.println(lordOfTheRings.showPageNumber());
    }
}
