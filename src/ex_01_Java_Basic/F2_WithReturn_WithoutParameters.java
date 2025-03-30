package ex_01_Java_Basic;

public class F2_WithReturn_WithoutParameters {
        int add()
        {
            int a = 10;
            int b = 20;
            int c = a + b;
            return c;
        }
    public static void main(String[] args) {
        F2_WithReturn_WithoutParameters objref = new F2_WithReturn_WithoutParameters();
        int result = objref.add();
        System.out.println(result);
    }
}
