package ex_01_Java_Basic;

public class F3_WithoutReturn_WithParameters {
    void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        F3_WithoutReturn_WithParameters objref = new F3_WithoutReturn_WithParameters();
        objref.add(10,20);
    }
}
