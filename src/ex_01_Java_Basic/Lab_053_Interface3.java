package ex_01_Java_Basic;

public class Lab_053_Interface3 implements Lab_051_Interface1, Lab_052_Interface2 {
    @Override
    public void height()
    {
        int height = (Lab_051_Interface1.height+Lab_052_Interface2.height)/2;
        System.out.println(height);
    }
}
