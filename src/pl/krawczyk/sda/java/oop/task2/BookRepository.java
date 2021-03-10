package pl.krawczyk.sda.java.oop.task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    protected List<Book> booksInLibrary= new ArrayList<>();

    public void bookAdd(Book book){
        booksInLibrary.add(book);
    }
    public void deleteBook(String isbn) throws NoBookFoundException{
        for (Book book: booksInLibrary) {
            if (book.getIsbn().equals(isbn)){
                booksInLibrary.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Sory we cant delete book with isbn: "+isbn);
    }

    public Book findBookbyIsbn(String isbn) throws NoBookFoundException{
        for (Book book:booksInLibrary) {
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        throw new NoBookFoundException("Sorry we havent book with isbn"+isbn);
    }

    public Book findBookByTitle(String title) throws NoBookFoundException{
        for (Book book:booksInLibrary) {
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        throw new NoBookFoundException("Sorry we havent book with title "+title);
    }



}
