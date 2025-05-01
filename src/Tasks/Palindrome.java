package Tasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String userInput = sc.next();  // Taking user input

        // Call reverseString() to reverse the input string and store the result in 'newString'
        String newString = reverseString(userInput);  // Correctly assigning the reversed string

        // Check if the reversed string is equal to the original string (case-insensitive comparison)
        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    // Corrected reverseString() method: returns a String, not Object
    private static String reverseString(String userInput) {
        String reverse = "";  // String to store the reversed version
        for (int i = userInput.length() - 1; i >= 0; i--) {  // Loop from end to start
            reverse = reverse + userInput.charAt(i);  // Append characters in reverse order
        }
        return reverse;  // Return the reversed string
    }
}