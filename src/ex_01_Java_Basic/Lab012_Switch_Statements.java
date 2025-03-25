package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab012_Switch_Statements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day - 1 to 7");
        int day = s.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error - out of range");
        /*If default isnt mentioned, there will be no error. Just the output will
                not be printed.
                int a = 10;
                switch (a); - valid
                char ch = 'A'
                switch (ch); - valid sop gives ASCII value.
                */
        }
    }

}