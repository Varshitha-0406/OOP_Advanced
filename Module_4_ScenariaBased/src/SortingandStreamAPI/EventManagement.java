package SortingandStreamAPI;
import java.util.*;
class Event implements Comparable<Event> {
    String name;
    String date; 
    int attendance;

    Event(String name, String date, int attendance) {
        this.name = name;
        this.date = date;
        this.attendance = attendance;
    }
    public int compareTo(Event other) {
        return this.date.compareTo(other.date);
    }

    public String toString() {
        return name + " | Date: " + date + " | Attendance: " + attendance;
    }
}

public class EventManagement {
    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();
        events.add(new Event("Music Festival", "2025-11-12", 5000));
        events.add(new Event("Tech Conference", "2025-10-28", 3000));
        events.add(new Event("Art Exhibition", "2025-11-05", 1500));
        events.add(new Event("Food Carnival", "2025-12-01", 7000));
        events.add(new Event("Startup Meetup", "2025-11-05", 2000));

        System.out.println("Sorted by Date (Ascending):");
        Collections.sort(events);
        events.forEach(System.out::println);

        System.out.println("\nSorted by Attendance (Descending):");
        Comparator<Event> byAttendanceDesc = (e1, e2) -> Integer.compare(e2.attendance, e1.attendance);
        Collections.sort(events, byAttendanceDesc);
        events.forEach(System.out::println);
    }
}
