package ex_01_Java_Basic;

import java.util.Locale;

public class Lab_025_String01 {
    public static void main(String[] args) {
        String name = "bhargavi";
        name.toUpperCase(); //this gives bhargavi only
        name = name.toUpperCase();
        System.out.println(name);
    }
}
