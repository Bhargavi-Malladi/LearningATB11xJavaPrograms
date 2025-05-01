package ex_01_Java_Basic;

public class Lab_041_Matrix_TwoDArray {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" | "); //use print to get result in single line
                //For 3*3 * matrix
                //System.out.print("*"+" ");
            }
            System.out.println(); //after every row, this will be executed.
        }
    }
}
