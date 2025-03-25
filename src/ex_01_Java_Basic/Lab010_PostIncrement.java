package ex_01_Java_Basic;

public class Lab010_PostIncrement {
    public static void main(String[] args) {
//        int c = 30;
//        System.out.println(c++);
//        /* o/p - 30
//        First c value is printed as it is and then gets incremented.
//        The incremented value is used in next run */
//        System.out.println(c); //Here the incremented value is given as o/p.
//        int a = 10;
//        System.out.println(a++ + ++a); //10 + 1+11
//        int d = 50;
//        System.out.println(++d + ++d); //51 + 1+51
//        System.out.println(d); //52
        int e = 10;
        System.out.println(--e);
        System.out.println(e);
        int f= 10;
        System.out.println(++f + f++ + f++); //11+11+12
        System.out.println(f);
    }
}
