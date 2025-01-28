public class Book {
    private String bookName;
    private String authorName;
    private double basePrice;
    private boolean isAvailable;

    public Book(String bookName, String authorName,double basePrice) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isAvailable = true;
        this.basePrice = basePrice;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
    public double getBasePrice(){
        return  basePrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(boolean value){
        isAvailable = value;
    }

    public int calculateBasePrice(int noOfDays) {
        return (int) (basePrice * noOfDays);
    }
}
