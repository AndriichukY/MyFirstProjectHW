package HW8SecondTask;

public class Magazine implements Printable{

    String title;
    public Magazine(String title) {
        this.title = title;
    };

    public void print() {
        System.out.println("The magazine tittle is: " + title);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {

            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
