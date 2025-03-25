package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_014_ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.next();

        System.out.println("Enter your age");
        int age = s.nextInt();

        System.out.println("Enter your salary");
        double salary = s.nextDouble();

        System.out.println("Your name is " +name);
        System.out.println("Your age is " +age);
        System.out.println("Your salary is " +salary);

        s.close();
    }
}
