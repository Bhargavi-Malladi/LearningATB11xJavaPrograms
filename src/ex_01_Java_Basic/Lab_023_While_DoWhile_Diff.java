package ex_01_Java_Basic;

public class Lab_023_While_DoWhile_Diff {
    public static void main(String[] args) {
        //while - checks the cond first
        int a =10;
        while(a<10) //false - no output
        {
            System.out.println(a);
            a++;
        }
        //DoWhile - Executes at least once before checking the condition
        int b =20;
        do {
            System.out.println(b);
            b++;
        }
        while(b<20); //at least one execution will be done before this step (cond check)
    } //o/p 20.
}
