package ex_01_Java_Basic;

public class Lab_038_SubString {
    public static void main(String[] args) {
        //substring is index-1 - 11-15 is actually 11 to 14.
        String substring = "I don't understand this man!";
        //  123456789
        String ss = substring.substring(2, 9); //2 to 8.
        System.out.println(ss);
    }
}