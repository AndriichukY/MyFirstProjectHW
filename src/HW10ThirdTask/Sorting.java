package HW10ThirdTask;

import java.util.LinkedList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        int x = 8;
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(22);
        numbers.add(16);
        numbers.add(5);
        numbers.add(4);

        System.out.println("List of numbers before sorting: " + numbers);
        System.out.println("List of numbers after sorting: " + sortValues(numbers, x));
    }

    public static LinkedList<Integer> sortValues(LinkedList<Integer> numbers, int x) {
        int i = 0;
        int j = numbers.size() - 1;

        while (i < j) {
            if(numbers.get(i) <= x) {
                i++;
            }
            else {
                numbers.addLast(numbers.remove(i));
                j--;
            }
        }

        return numbers;
    }
}
