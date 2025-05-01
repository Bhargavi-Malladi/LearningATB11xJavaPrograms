package My_Java_Programs_BSharma;

public class AbstractExample2 extends AbstractExample1{

    AbstractExample2(int registrationNumber)
    {
        super(registrationNumber);
        System.out.println("Registration number is " + registrationNumber);
    }

    @Override
    void steering() {
            System.out.println("Abs ex 2 steering");
    }

    @Override
    void brakes() {
        System.out.println("Abs ex 2 brakes");
    }

}
