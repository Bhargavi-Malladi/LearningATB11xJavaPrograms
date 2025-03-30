package ex_01_Java_Basic;

public class F4_WithReturn_WithParameters {
    int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        F4_WithReturn_WithParameters objref = new F4_WithReturn_WithParameters();
        int result = objref.add(30,40);
        System.out.println(result);
    }
}
