package HW12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Yulia", "Andriichuk", 25));
        users.add(new User("Sergii", "Cool", 20));
        users.add(new User("Michael", "Johnson", 35));
        users.add(new User("Sophia", "Great", 30));
        users.add(new User("Daniel", "Brown", 18));
        users.add(new User("Maria", "Miller", 22));
        users.add(new User("Alex", "Taylor", 28));
        users.add(new User("Emma", "Wilson", 40));
        users.add(new User("Alexander", "Jones", 19));
        users.add(new User("Isabella", "Kozak", 32));

        List<User> sortedByAge = new ArrayList<>(users);
        sortedByAge.sort(Comparator.comparingInt(User::getAge));

        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);

        List<User> sortedByMultipleProperties = users.stream()
                .sorted(Comparator.comparing(User::getFirstName)
                        .thenComparingInt(User::getAge))
                .toList();

        boolean hasUsersWithSA = users.stream()
                .anyMatch(user -> user.getLastName().startsWith("S") || user.getLastName().startsWith("A"));

        boolean allUsersOver18 = users.stream()
                .allMatch(user -> user.getAge() > 18);

        System.out.println("The list of users");
        users.forEach(System.out::println);

        System.out.println("\nSorted by age:");
        sortedByAge.forEach(System.out::println);

        System.out.println("\nAverage age: " + averageAge);

        System.out.println("\nSorted by firstName and age:");
        sortedByMultipleProperties.forEach(System.out::println);

        System.out.println("\nAre there users whose last name starts from 'S' or 'A': " + hasUsersWithSA);

        System.out.println("\nAre all users older than 18: " + allUsersOver18);
    }
}
