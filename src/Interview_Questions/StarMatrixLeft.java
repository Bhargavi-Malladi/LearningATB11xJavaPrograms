package Interview_Questions;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StarMatrixLeft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();

        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
