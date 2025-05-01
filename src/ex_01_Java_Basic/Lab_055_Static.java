package ex_01_Java_Basic;

public class Lab_055_Static {
    public static void main(String[] args) {
        ATB c = new ATB();
        c.doAssignment();
        c.makeComments();
        c.setName("Bhargavi Sharma");
        c.setPhoneNumber(999);

        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);
        System.out.println(ATB.modeOfJoin);
        ATB.timings(); //Correct way to call void static methods.

    }
}

class ATB {
    static {
        System.out.println("This will be executed when class is loaded");
    }

    {
        System.out.println("This is called when object is created");
    }

    private String name;
    private int phoneNumber;
    static String mentorName = "Pramod";
    static String courseName = "ATB";
    static String modeOfJoin = "Zoom";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void doAssignment()
    {
        System.out.println("Individual Assignment");
    }

    void makeComments()
    {
        System.out.println("Individual comments");
    }

    static void timings()
    {
        System.out.println("Everyone joins at 7AM!");
    }
}