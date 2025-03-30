package ex_01_Java_Basic;

public class Lab_036_String12_Split {
    public static void main(String[] args) {
        String name = "Bhargavi@Sharma@Malladi";
        String s1[] = (name.split("@"));
        System.out.println(s1[0]);
        System.out.println(s1[1]);
        System.out.println(s1[2]);
    }
}
