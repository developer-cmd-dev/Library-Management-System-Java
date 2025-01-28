import com.sun.security.jgss.GSSUtil;

import java.util.Collections;

public class ManagementSystem extends Library implements DataBase{

    @Override
    public void addBook(Book[] book) {
        Collections.addAll(bookList, book);
    }

    @Override
    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }

    public void menu(){
        System.out.println("============*** Welcome to Nalanda Vishwa Vidyalay Library ***=========="  );
    }
}
