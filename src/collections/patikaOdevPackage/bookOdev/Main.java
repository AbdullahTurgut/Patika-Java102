package collections.patikaOdevPackage.bookOdev;

import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(new OrderByNameOfBook());

        books.add(new Book("Calı Kuşu","H. Edip Adıvar",406, 2013));
        books.add(new Book("Geniş Zamanlar","Ayşe Kulin",114, 2020));
        books.add(new Book("Yaprak Dökümü","R. Nuri Güntekin",134, 2006));
        books.add(new Book("Intibah","Namık Kemal",176, 1874));
        books.add(new Book("Don Kişot","Cervantes",320, 1605));

        for (Book book : books)
            System.out.println(book.toString());
    }
}
