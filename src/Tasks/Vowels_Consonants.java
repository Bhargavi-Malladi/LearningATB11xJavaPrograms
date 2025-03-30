package Tasks;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.next();
        name = name.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }
            System.out.println("Number of vowels in your name " + vowels);
            System.out.println("Number of consonants in your name " + consonants);

        }
    }

