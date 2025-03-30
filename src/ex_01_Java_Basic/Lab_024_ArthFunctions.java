package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_024_ArthFunctions {

    public static void main(String[] args) {
        //FOLLOW THE SEQUENCE!!!
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();

    int result_sum = sum(a, b);
    int result_sub = sub(a, b);
    int result_mul = mul(a, b);
    int result_div = div(a, b);
    int result_mod = mod(a, b);

    // Display the results
        System.out.println("Sum: "+result_sum);
        System.out.println("Subtraction: "+result_sub);
        System.out.println("Multiplication: "+result_mul);
        System.out.println("Division: "+result_div);
        System.out.println("Modulus: "+result_mod);

    s.close();
}
    //Methods
    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    }