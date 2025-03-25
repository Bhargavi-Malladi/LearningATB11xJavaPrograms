package ex_01_Java_Basic;

public class Lab_020_WhileLoop {
    public static void main(String[] args) {
        int i =0; //Initialize
        while(i<=50) //Condition
        {
            System.out.println(i);
            i++;
        }
//        for(int j=51;j<=100;j++)
//            System.out.println(j);
        while(true)
            System.out.println("Condition is given as true as it enters the loop");
            //But here it prints the o/p infinite times.
    }
}
