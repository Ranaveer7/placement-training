import java.time.*;
import java.util.*;

class Event {
    String name;
    LocalDate date;

    Event(String n, LocalDate d) {
        name = n;
        date = d;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Event[] events = new Event[n];
        for (int i = 0; i < n; i++) {
            events[i] = new Event(sc.next(), LocalDate.parse(sc.next()));
        }

        int month = sc.nextInt();

        // Sort events by date (bubble sort – brute force)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (events[i].date.isAfter(events[j].date)) {
                    Event temp = events[i];
                    events[i] = events[j];
                    events[j] = temp;
                }
            }
        }

        // Print sorted events
        for (Event e : events)
            System.out.print(e.name + " ");
        System.out.println();

        // Earliest event
        System.out.println(events[0].name);

        // Latest event
        System.out.println(events[n - 1].name);

        // Events in given month
        for (Event e : events) {
            if (e.date.getMonthValue() == month)
                System.out.print(e.name + " ");
        }
    }
}
