import java.util.ArrayList;

public class Library {      // create Class Library
    ArrayList<Book> collection;   //make AL of collection

    public Library(){
        collection = new ArrayList<Book>(); //create new book AL class Book
    }

    public int bookCount(){
      return this.collection.size();
    }

    public void addBook(Book book){
        this.collection.add(book);
    }

    public void removeBook(Book book){
        this.collection.remove(0);
    }

}
