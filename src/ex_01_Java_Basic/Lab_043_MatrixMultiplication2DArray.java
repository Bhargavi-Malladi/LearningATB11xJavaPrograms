package ex_01_Java_Basic;
import java.util.Scanner;

public class Lab_043_MatrixMultiplication2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of table");
        int size = s.nextInt();
        for(int i =0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(i+ "x" +j + "=" +i*j +"\t");
            }
            System.out.println();
        }

    }
}
