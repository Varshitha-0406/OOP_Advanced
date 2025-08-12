package oop_practical;

import java.util.Scanner;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayRole() {
        System.out.println("I am a person.");
    }
}
class Admin extends Person {
    Admin(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("I am Admin: " + name);
    }
}
class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("I am Student: " + name);
    }
}

class Faculty extends Person {
    Faculty(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("I am Faculty: " + name);
    }
}
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Admin name: ");
        Person p1 = new Admin(sc.nextLine());
        System.out.print("Enter Student name: ");
        Person p2 = new Student(sc.nextLine());
        System.out.print("Enter Faculty name: ");
        Person p3 = new Faculty(sc.nextLine());
        System.out.println("\nRoles :");
        p1.displayRole();
        p2.displayRole();
        p3.displayRole();

        sc.close();
    }
}
