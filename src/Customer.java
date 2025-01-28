public class Customer {
    private String name;
    private int contactNo;
    private int id;
    private Book book;

    public Customer(String name, int contactNo, int id, Book book) {
        this.name = name;
        this.contactNo = contactNo;
        this.id = id;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }
}
