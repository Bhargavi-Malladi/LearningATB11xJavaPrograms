package ex_01_Java_Basic;

public class Lab013_CLI_Options {
    public static void main(String[] args) {
        System.out.println("Please enter your name, age, salary");
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
