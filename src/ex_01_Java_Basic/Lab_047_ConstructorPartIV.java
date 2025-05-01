package ex_01_Java_Basic;

public class Lab_047_ConstructorPartIV {
    String name;
    int age;
    String address;
    int number;

    Lab_047_ConstructorPartIV()
    {
        System.out.println("This is default constructor");
    }

    Lab_047_ConstructorPartIV(String nameag,int ageag,String addressag,int numberag)
    {
        this.name = nameag;
        this.age = ageag;
        this.address = addressag;
        this.number = numberag;
    }

    Lab_047_ConstructorPartIV(String nameag,int ageag)
    {
        this.name = nameag;
        this.age = ageag;
    }

    void details()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(number);

    }

    public static void main(String[] args) {
        Lab_047_ConstructorPartIV cp1 = new Lab_047_ConstructorPartIV();
        System.out.println(cp1.number);
        Lab_047_ConstructorPartIV cp = new Lab_047_ConstructorPartIV("ABC", 10, "XYZ", 123);
        System.out.println(cp.number);
    }
}
