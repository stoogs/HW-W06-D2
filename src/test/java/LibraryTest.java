import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/* MVP
Write a method to count the number of collection in the library.
Write a method to add a book to the library stock.
Add a capacity to the library and write a method to check if stock is full before adding a book.*/
public class LibraryTest {
    Book book;
    Library library;

   @Before
    public void before(){
       book = new Book();
       library = new Library();
       int max = 5;
   }

   @Test
    public void bookSize(){
       assertEquals(0,library.bookCount());
   }

    @Test
    public void bookAdded(){
       library.addBook(book);
       assertEquals(1, library.bookCount());
    }

    @Test
    public void bookRemoved(){
       library.addBook(book);
        System.out.println(library.bookCount());
       assertEquals(1,library.bookCount());
       library.removeBook(book);
        System.out.println(library.bookCount());
        assertEquals(0,library.bookCount());
   }

    @Test
    public void anyRoom(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        if (this.library.bookCount() < 5) {
            library.addBook(book);
        } else{
            System.out.println("No Room");
        }
        assertEquals(5, library.bookCount());
    }



} // class


