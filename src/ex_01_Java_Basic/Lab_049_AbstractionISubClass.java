package ex_01_Java_Basic;

public class Lab_049_AbstractionISubClass extends Lab_048_AbstractionI {

    Lab_049_AbstractionISubClass(String name)
    {
        super(name);
    }
    void makeSound()
    {
        System.out.println("Dog says Woof!");
    }
    void eat()
    {
        System.out.println("Benson eats pedigree");
    }



}
