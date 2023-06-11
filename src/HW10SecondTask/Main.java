package HW10SecondTask;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        FirstVariantArrayList firstVariantArrayList = new FirstVariantArrayList();
        SecondVariantLinkedList secondVariantLinkedList = new SecondVariantLinkedList();

        ArrayList<Integer> circleOfPeople1 = new ArrayList();
        LinkedList<Integer> circleOfPeople2 = new LinkedList<>();

        System.out.println("Є коло з людей: " + firstVariantArrayList.fillNewList(circleOfPeople1, 11));
        System.out.println("Остання особа, яка залишилася після викреслювання: " + firstVariantArrayList.removePeopleFromCircle(circleOfPeople1));

        System.out.println("Є коло з людей: " + secondVariantLinkedList.fillNewList(circleOfPeople2, 55));
        System.out.println("Остання особа, яка залишилася після викреслювання: " + secondVariantLinkedList.removePeopleFromCircle(circleOfPeople2));

        //для даної задачі LinkedList буде ефективнішим, оскільки видалення з середини списку виконується швидше, а також немає зсуву елементів.
    }
}
