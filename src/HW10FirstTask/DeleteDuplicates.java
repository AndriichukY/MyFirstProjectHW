package HW10FirstTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeleteDuplicates {
    public static void main(String[] args) {

        List<Integer> newList = new ArrayList(100);
        fillList(newList);
        List newListWithoutDuplicates = new ArrayList<>(newList);

        System.out.println("List before deleting duplicates: " + newList);
        System.out.println("List after deleting duplicates:" + deleteDuplicates(newListWithoutDuplicates));
        System.out.println("Quantity of deleted values is: " + quantityOfDeleted(newList, newListWithoutDuplicates));

    }

    public static List fillList(List newList) {
        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            newList.add(i, rand.nextInt(50));
        }

        return newList;
    }

    public static List deleteDuplicates(List newListAfterDeleting) {
        for(int i = 0; i < newListAfterDeleting.size(); i++) {
            for(int j = i + 1; j < newListAfterDeleting.size(); j++) {
                if(newListAfterDeleting.get(i) == newListAfterDeleting.get(j)) {
                    newListAfterDeleting.remove(j);
                    j = j - 1;
                }
            }
        }
        return newListAfterDeleting;
    }

    public static int quantityOfDeleted(List newList, List newListWithoutDuplicates) {
        return newList.size() - newListWithoutDuplicates.size();
    }
}
