import java.util.*;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    static boolean isOlder(Person p, int limit) {
        return p.age > limit;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i] = new Person(sc.next(), sc.nextInt());
        }

        int ageLimit = sc.nextInt();

        // Sort names alphabetically (simple sorting)
        String[] names = new String[n];
        for (int i = 0; i < n; i++)
            names[i] = persons[i].name;

        Arrays.sort(names);
        for (String s : names)
            System.out.print(s + " ");
        System.out.println();

        // Filter persons older than ageLimit
        for (Person p : persons) {
            if (Person.isOlder(p, ageLimit))
                System.out.print(p.name + " ");
        }
        System.out.println();

        // Convert names to uppercase
        for (Person p : persons) {
            System.out.print(p.name.toUpperCase() + " ");
        }
    }
}
