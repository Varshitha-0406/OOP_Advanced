package JavaGenerics;
import java.util.*;
import java.util.function.Predicate;
public class CricketAnalytics {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(23, 78, 45, 90, 56, 32, 67, 12, 88);
        Predicate<Integer> aboveFifty = score -> score > 50;
        System.out.println("Scores above 50:");
        scores.stream()
              .filter(aboveFifty) 
              .forEach(System.out::println);  
    }
}
