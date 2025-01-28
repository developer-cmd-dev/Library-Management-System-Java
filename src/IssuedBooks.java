public class IssuedBooks {
  private   Customer customer;
  private Book book;
  private int rentDays;

    public IssuedBooks(Customer customer, Book book,int rentDays) {
        this.customer = customer;
        this.book = book;
        this.rentDays = rentDays;
    }

    public void printIssuedStatement(){
        System.out.println("Customer Name: "+customer.getName());
        System.out.println("Book Name: "+book.getBookName());
        System.out.println("Issued Day: "+rentDays);
        System.out.println("Total Price: "+book.calculateBasePrice(rentDays));
    }

    public Customer getCustomer() {
        return customer;
    }

    public Book getBook() {
        return book;
    }

    public String toString(){
        return "Customer id: "+customer.getId()+", Book name: "+book.getBookName()+" Successfully returned.";
    }
}
