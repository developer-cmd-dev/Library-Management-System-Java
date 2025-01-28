import java.util.ArrayList;
import java.util.Scanner;

public abstract class Library {
    ArrayList<Book> bookList;
    ArrayList<Customer>customersList;
    ArrayList<IssuedBooks>issuedBooksList;
    Scanner sc = new Scanner(System.in);



    public Library(){
        bookList = new ArrayList<Book>();
        customersList = new ArrayList<>();
        issuedBooksList = new ArrayList<>();
    }

    public abstract void addIssuedBooks(Customer customer, Book book, int rentDay);
}
