import java.util.*;

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

        Friend maxAgeFriend = friends.stream()
                .max((f1, f2) -> f1.age - f2.age)
                .get();

        System.out.println("Maximum age is: " + maxAgeFriend.age);
        System.out.println("Friend name is: " + maxAgeFriend.name);
    }
}

