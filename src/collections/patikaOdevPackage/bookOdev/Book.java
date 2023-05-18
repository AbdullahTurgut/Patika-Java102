package collections.patikaOdevPackage.bookOdev;

import java.util.Date;

public class Book{
    private String name;
    private String authorOfBook;
    private int pageNumber;
    private int publishedDay;

    public Book(String name, String authorOfBook, int pageNumber, int publishedDay) {
        this.name = name;
        this.authorOfBook = authorOfBook;
        this.pageNumber = pageNumber;
        this.publishedDay = publishedDay;
    }

    @Override
    public String toString() {
        return  "Kitap Adı= '" + name + '\'' +
                "\tYazarı= '" + authorOfBook + '\'' +
                "\tSayfa Sayısı= " + pageNumber +
                "\tYayın Tarihi= " + publishedDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPublishedDay() {
        return publishedDay;
    }

    public void setPublishedDay(int publishedDay) {
        this.publishedDay = publishedDay;
    }
}
