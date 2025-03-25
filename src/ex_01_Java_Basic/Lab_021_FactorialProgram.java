package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_021_FactorialProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide input for factorial");
        int a = s.nextInt();

        int factorial =1;
        if(a<=0)
        {
            System.out.println(factorial);
        }
        else
        {
            for(int i =1;i<=a;i++)
            {
                factorial=factorial*i;
            }
            System.out.println(factorial);
        }
    }
}
