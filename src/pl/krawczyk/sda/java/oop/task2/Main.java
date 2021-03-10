package pl.krawczyk.sda.java.oop.task2;

public class Main {

    public static void main(String[] args) throws NoBookFoundException {

        Book book1 = new Book("Elementary","Ala ma kota","Noname",1990);
        Book book2 = new Book("Elementary","Ala ma psa","Waclaw",2010);
        Book book3 = new Book("Secondary","Ala ma mysz","Zbysiu",1940);
        Book book5 = new Book("Secondary","Ala ma mysz","Zbysiu",1940);
        Book book4 = new Book("Elementary","Ala ma pajaka","Andrzej",2005);

       BookRepository library = new BookRepository();
       library.bookAdd(book1);
       library.findBookByTitle("Ala ma kota");
      // library.findBookByTitle("Ala ma psa");
       library.bookAdd(book2);
       library.bookAdd(book3);
       library.bookAdd(book4);
        System.out.println(book1.toString());
       library.findBookbyIsbn("Secondary");
       library.deleteBook("Secondary");
        System.out.println(book3.toString());
        library.findBookbyIsbn("Secondary");

    }
}
