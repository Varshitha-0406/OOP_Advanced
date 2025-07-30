package basic_programss;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = b != 0 ? a / b : 0;
        int remainder = b != 0 ? a % b : 0;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " * " + b + " = " + product);
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + quotient);
            System.out.println(a + " % " + b + " = " + remainder);
        } else {
            System.out.println("Division and modulus by zero are not allowed.");
        }

        sc.close();
    }
}
