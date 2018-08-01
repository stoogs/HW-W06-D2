import java.util.ArrayList;

public class Library {      // create Class Library
    // instance variables = Objects created with class objects
   private ArrayList<Book> collection;   //make AL of collection

    public Library(){
        collection = new ArrayList<Book>(); //create new book AL class Book
    }
    // return int of array size
    public int bookCount(){
      return this.collection.size();
    }
    /**
     * add a book
     * @param book added a book
     */
    public void addBook(Book book) { //expect a Book book
        if (this.collection.size() < 4) {
            this.collection.add(book);

            System.out.println("Library is at" + this.collection.size());
            System.out.println("Max capacity is 4");// collection << book
        }

    }
    public void removeBook(Book book){
        this.collection.remove(0);
    }

}
