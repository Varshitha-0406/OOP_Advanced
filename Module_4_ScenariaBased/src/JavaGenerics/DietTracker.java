package JavaGenerics;
import java.util.*;
import java.util.function.Consumer;
public class DietTracker {
    public static void main(String[] args) {
        ArrayList<Integer> calorieIntakes = new ArrayList<>(
                Arrays.asList(1800, 2200, 1950, 2500, 1700, 2100, 3000)
        );
        Consumer<Integer> highCalorieConsumer = calories -> {
            if (calories > 2000) {
                System.out.println("High calorie day: " + calories + " kcal");
            }
        };
        System.out.println("Days exceeding 2000 calories:");
        calorieIntakes.forEach(highCalorieConsumer);
    }
}
