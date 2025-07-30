package basic_programss;

import  java.util.Scanner;

public class q7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number");
	double n1=sc.nextDouble();
	System.out.print("Enter secound number");
	double n2=sc.nextDouble();
	System.out.print("Enter the third number");
	double n3=sc.nextDouble();
	double average = (n1+n2+n3)/3;
	System.out.println("numbers entered are  " + n1 + "," +  n2 + "and" + n3 );
	System.out.println("Average is    :"+ average);
	 System.out.println("\nExplanation:");
     System.out.println("Expression used: (n1 + n2 + n3) / 3");
     System.out.println("1. Parentheses are evaluated first: (n1 + n2 + n3)");
     System.out.println("2. Division (/) is then applied to the result");
     System.out.println("Operator precedence ensures accurate grouping and correct result.\n");
	sc.close();
	
}
}
