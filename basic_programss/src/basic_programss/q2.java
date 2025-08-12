package basic_programss;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter Percentage: ");
        float percentage = sc.nextFloat();
        System.out.println("\n--- Student Details ---");
        System.out.printf("Name       : %s\n", name);
        System.out.printf("Roll No.   : %d\n", roll);
        System.out.printf("Age        : %d\n", age);
        System.out.printf("Gender     : %c\n", gender);
        System.out.printf("Percentage : %.2f%%\n", percentage);
        sc.close();
    }
}
