public class Book {
    private String bookName;
    private String authorName;
    private double basePrice;
    private boolean isAvailable;

    public Book(String bookName, String authorName,double basePrice) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isAvailable = false;
        this.basePrice = basePrice;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double calculateBasePrice(double noOfDays) {
        return basePrice * noOfDays;
    }
}
