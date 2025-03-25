package ex_01_Java_Basic;

public class Lab_017_Even_Odd_1to50 {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
            if(i%2==0) //if(i%2!=0) --> odd.
            {
                System.out.println("Even number is --> "+i);
            }
        else
            {
                System.out.println("Odd number is --> "+i);
            }
        //else part can be removed if only even numbers are required as o/p.
    }
}
