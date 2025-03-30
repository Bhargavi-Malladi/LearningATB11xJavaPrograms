package ex_01_Java_Basic;

public class Lab_037_String13_Combo {
    public static void main(String[] args) {
        String name = "Bhargavi";
        System.out.println(name.startsWith("s"));
        System.out.println(name.endsWith("i"));
        String name1 = "   Bhargavi   Sharma "; //Space between B and S is not removed.
        System.out.println(name1.trim());
        String name2 = "Bhargavi Malladi";
        System.out.println(name2.compareTo("Bhargavi Sharma"));
        //If line 10==11, result will be 0 else alphabetically M is smaller
        //than S so we get a negative integer as result.
        String name3 = "Bhargavi";
        System.out.println(name3.compareToIgnoreCase("bhargavi"));
    }
}
