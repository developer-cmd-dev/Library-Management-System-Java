//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book theAlchemist = new Book("The Alchemist","Paulo Coelho",20);
        Book toKillaMockingbird = new Book("To Kill a Mockingbird","Harper Lee",25);
        Book ninetineEightyFour = new Book("1984","George Orwell",30);
        Book theGreatGatsby = new Book("The Great Gatsby","F. Scott Fitzgerald",15);
        Book prideandPrejudice = new Book("Pride and Prejudice","Jane Austen",10);

        Book bookArr[] = {theAlchemist,toKillaMockingbird,ninetineEightyFour,theGreatGatsby,prideandPrejudice};
        ManagementSystem managementSystem = new ManagementSystem();
        managementSystem.addBook(bookArr);
        managementSystem.menu();




    }
}