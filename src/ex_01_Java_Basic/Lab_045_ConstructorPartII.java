package ex_01_Java_Basic;

public class Lab_045_ConstructorPartII {
    String name;
    int year;
    String modelName;

    Lab_045_ConstructorPartII()
    {
    }

    public static void main(String[] args) {
        Lab_045_ConstructorPartII cp = new Lab_045_ConstructorPartII();
        cp.name = "Honda";
        System.out.println(cp.name);
        System.out.println(cp.year);
        System.out.println(cp.modelName);

        System.out.println(" ----------------- ");

        Lab_045_ConstructorPartII cp1 = new Lab_045_ConstructorPartII();
        cp1.name = "Honda";
        System.out.println(cp1.name);
        System.out.println(cp1.year);
        System.out.println(cp1.modelName);
    }
}
