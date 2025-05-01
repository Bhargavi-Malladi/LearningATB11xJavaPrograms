package ex_01_Java_Basic;

public class Lab_046_ConstructoPartIII {
    String name;
    String color;
    int year;
    int phoneNumber;

    Lab_046_ConstructoPartIII(String nameAg,String colorAg,int yearAg,int phoneNumberAg)
    {
        this.name = nameAg;
        this.color = colorAg;
        this.year = yearAg;
        this.phoneNumber = phoneNumberAg;
    }

    void displayDetails()
    {
        System.out.println(name);
        System.out.println(color);
        System.out.println(year);
        System.out.println(phoneNumber);

    }

    public static void main(String[] args) {
        Lab_046_ConstructoPartIII cp = new Lab_046_ConstructoPartIII("Honda","Silver",2017,9999);
        cp.displayDetails();
    }
}
