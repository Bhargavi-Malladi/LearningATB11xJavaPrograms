package ex_01_Java_Basic;

public class Lab_027_String03_StringIndexOutOfBoundException {
    public static void main(String[] args) {
        String s ="Bhargavi";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(9)); //exception

    }
}
