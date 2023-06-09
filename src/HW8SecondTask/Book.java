package HW8SecondTask;

public class Book implements Printable {

    String title;
    public Book(String title) {
        this.title = title;
    };

    public void print() {
        System.out.println("The book tittle is: " + title);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {

            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
