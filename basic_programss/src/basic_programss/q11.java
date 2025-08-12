package basic_programss;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.printf("Radius        : %.2f\n", radius);
        System.out.printf("Area          : %.2f\n", area);
        System.out.printf("Circumference : %.2f\n", circumference);
        sc.close();
    }
}
