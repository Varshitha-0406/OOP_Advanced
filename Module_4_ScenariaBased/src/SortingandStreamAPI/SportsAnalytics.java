package SortingandStreamAPI;

import java.util.*;

class Athlete implements Comparable<Athlete> {
    String name;
    String country;
    double score;

    Athlete(String name, String country, double score) {
        this.name = name;
        this.country = country;
        this.score = score;
    }

    public int compareTo(Athlete other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public String toString() {
        return name + " (" + country + ") - Score: " + score;
    }
}

public class SportsAnalytics {
    public static void main(String[] args) {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete("David", "USA", 95.4));
        athletes.add(new Athlete("Alice", "UK", 89.2));
        athletes.add(new Athlete("Carlos", "Spain", 92.5));
        athletes.add(new Athlete("Bella", "India", 88.8));

        System.out.println("Sorted by Name (Alphabetically):");
        Collections.sort(athletes);
        athletes.forEach(System.out::println);

        System.out.println("\nSorted by Score (Descending):");
        Comparator<Athlete> byScoreDesc = (a1, a2) -> Double.compare(a2.score, a1.score);
        Collections.sort(athletes, byScoreDesc);
        athletes.forEach(System.out::println);
    }
}
