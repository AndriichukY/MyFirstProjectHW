package HW8SecondTask;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Printable[] printables = new Printable[4];
        printables[0] = new Book("Book 1")::print;
        printables[1] = new Book("Book 2")::print;
        printables[2] = new Magazine("Magazine 1")::print;
        printables[3] = new Magazine("Magazine 2")::print;

        for (Printable printable : printables) {
            printable.print();
        }

        System.out.println("List of magazines:");
        Magazine.printMagazines(printables);
        System.out.println("List of books:");
        Book.printBooks(printables);

        //Лямбда вираз для інтерфейсу Printable

        Printable printLambdaQuantity = () -> {
                System.out.println("The total quantity of items is " + printables.length);
        };

        printLambdaQuantity.print();
    }
}
