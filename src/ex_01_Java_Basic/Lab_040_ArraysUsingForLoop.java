package ex_01_Java_Basic;

public class Lab_040_ArraysUsingForLoop {
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5,6,7};
        System.out.println(marks.length);
        //Instead of printing sout(marks[0] .... marks[n]) use loop as below
        for(int i=0;i<marks.length;i++){
            //In arrays initialization always starts from 0. Hence length()-1 is not req.
            System.out.println(marks[i]);
        }
    }
}
