import java.util.Collections;

public class ManagementSystem extends Library implements DataBase {


    public ManagementSystem() {
        Library library = new Library() {
            @Override
            public void addIssuedBooks(Customer customer, Book book, int rentDay) {

            }
        };
    }

    @Override
    public void addIssuedBooks(Customer customer, Book book, int rentDay) {
        IssuedBooks issuedBooks = new IssuedBooks(customer,book,rentDay);
        issuedBooksList.add(issuedBooks);
        issuedBooks.printIssuedStatement();
    }


    @Override
    public void addBook(Book[] book) {
        Collections.addAll(bookList, book);
    }

    @Override
    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }



    @Override
    public void listBooks() {
        for(Book books:bookList){
            if(books.isAvailable()){
                System.out.println("Name: "+books.getBookName()+" Author: "+books.getAuthorName()+" Base price: "+books.getBasePrice());
            }
        }
    }




    public Book findBook(String bookName){
        for(Book books:bookList){
            if(bookName.equalsIgnoreCase(books.getBookName()) && books.isAvailable()){
                return books;
            }

        }
        return null;
    }

    public void returnBook(int id){
        for (IssuedBooks data:issuedBooksList){
            if(data.getCustomer().getId() == id){
                customersList.remove(data.getCustomer());
                data.getBook().setIsAvailable(true);
                issuedBooksList.remove(data);
                System.out.println(data);
                break;
            }else{
                System.out.println("Enter correct id or You did not rent any book.");
            }
        }
    }



    public void menu() {
        System.out.println("============*** Welcome to Nalanda Vishwa Vidyalay Library ***==========");
        int choice = 0;

        while (true) {
            System.out.println("1]. Issue Book \t\t\t 2].Return Book \t\t\t 3].List Books \t\t\t 4].Exit");
            choice = sc.nextInt();
            sc.nextLine();
            Book isAvailable = null;
            if (choice == 1) {
                System.out.print("Enter Book name: ");
                String bookName = sc.nextLine();
                 isAvailable = findBook(bookName);
                if(isAvailable !=null){
                    System.out.println("Book is available to rent.");
                    System.out.println("What is your name: ");
                    String customerName = sc.nextLine();
                    System.out.println("What is your Contact no: ");
                    int customerContactNo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Set you 4 digit id.");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Days for rent This Book: ");
                    int rentDay = sc.nextInt();
                    sc.nextLine();
                    isAvailable.setIsAvailable(false);
                    Customer customer = new Customer(customerName,customerContactNo,id,isAvailable);
                    addCustomer(customer);
                    addIssuedBooks(customer,isAvailable,rentDay);
                }else{
                    System.out.println("Book not found");
                }

            }else if(choice ==2){
                System.out.println("Enter your Id: ");
                int id =sc.nextInt();
                sc.nextLine();
                returnBook(id);
            }
            else if (choice ==3) {
                listBooks();
            } else if (choice ==4) {
                break;
            }else{
                System.out.println("Wrong input!");
            }

        }

    }
}
