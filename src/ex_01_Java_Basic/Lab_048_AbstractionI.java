package ex_01_Java_Basic;

import javax.xml.namespace.QName;

abstract class Lab_048_AbstractionI {
    String name;

    Lab_048_AbstractionI(String nameag) //Parameterized constructor
            //why? its like a family name. All the subclasses must inherit this.
    {
        this.name = nameag;
    }

    abstract void makeSound(); //Don't forget void
    abstract void eat();
    //these methods have to be implemented in sub-class.

    void sleep()
    {
        System.out.println(name+ "is sleeping");
    }
}


