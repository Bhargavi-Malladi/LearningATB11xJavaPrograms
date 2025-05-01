package ex_01_Java_Basic;


public class Lab_044_DefaultConstructor {
    String name;
    String behaviour;

    Lab_044_DefaultConstructor()
    {
        System.out.println("I am default constructor");
    }
    public static void main(String[] args) {

        Lab_044_DefaultConstructor df = new Lab_044_DefaultConstructor();
        //Dont have to call it, just create a new object, automatically
        //default constructor is called and executed.


    }
}
