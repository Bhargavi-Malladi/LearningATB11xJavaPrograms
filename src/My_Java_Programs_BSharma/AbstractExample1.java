package My_Java_Programs_BSharma;

public abstract class AbstractExample1 {
    int registrationNumber;

    AbstractExample1(int individualRNumber)
    {
        this.registrationNumber = individualRNumber;
    }

    abstract void steering();
    abstract void brakes();

    void fuelTank()
    {
        System.out.println("Open the tank and fill fuel");
    }

}
