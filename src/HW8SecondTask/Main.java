package HW8SecondTask;

public class Main {

    public static void main(String[] args) {

        Printable[] printables = new Printable[4];
        printables[0] = new Book("Book 1");
        printables[1] = new Book("Book 2");
        printables[2] = new Magazine("Magazine 1");
        printables[3] = new Magazine("Magazine 2");

        for (Printable printable : printables) {
            printable.print();
        }

        System.out.println("List of magazines:");
        Magazine.printMagazines(printables);
        System.out.println("List of books:");
        Book.printBooks(printables);
    }
}
