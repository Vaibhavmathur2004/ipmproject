import java.util.*;
import java.util.stream.*;

class Friend {
    String name;
    int age;

    Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Friend> friends = Arrays.asList(
                new Friend("Rahul", 21),
                new Friend("Aman", 23),
                new Friend("Rohit", 20),
                new Friend("Karan", 25)
        );

        String searchName = "Aman";

        friends.stream()
                .filter(f -> f.name.equalsIgnoreCase(searchName))
                .map(f -> f.age)
                .forEach(age ->
                        System.out.println(searchName + " age is: " + age));
    }
}