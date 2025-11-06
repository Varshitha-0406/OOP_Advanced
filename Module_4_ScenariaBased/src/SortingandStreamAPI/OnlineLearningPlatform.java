package SortingandStreamAPI;

import java.util.*;
import java.util.stream.*;

public class OnlineLearningPlatform {
    public static void main(String[] args) {

        List<Double> scores = Arrays.asList(85.5, 47.0, 92.3, 68.0, 59.5, 74.2, 88.9);

        System.out.println("Students scoring above 60% and their grades:");

        scores.stream()
              .filter(score -> score > 60) // select scores above 60%
              .map(score -> {
                  if (score >= 85) return "A (Score: " + score + ")";
                  else if (score >= 70) return "B (Score: " + score + ")";
                  else return "C (Score: " + score + ")";
              })
              .forEach(System.out::println);
    }
}
