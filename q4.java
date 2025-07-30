package basic_programss;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number (double): ");
        double doubleValue = sc.nextDouble();
        int intValue = (int) doubleValue;
        System.out.println("\n--- Narrowing Conversion ---");
        System.out.println("Original double value : " + doubleValue);
        System.out.println("Converted int value   : " + intValue);
        sc.close();
    }
}
