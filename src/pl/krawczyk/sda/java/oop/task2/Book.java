package pl.krawczyk.sda.java.oop.task2;

public class Book {
    protected String isbn;
    protected String title;
    protected String author;
    protected int yearOfPublication;

    public Book(String isbn, String title, String author, int yearOfPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


    @Override
    public String toString(){
        return "Title of book: "+title+
                " Author is : "+author+
                " isbn is: "+isbn+
                " Year of publication : "+yearOfPublication;
    }
}
