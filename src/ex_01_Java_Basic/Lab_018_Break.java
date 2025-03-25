package ex_01_Java_Basic;

public class Lab_018_Break {
    public static void main(String[] args) {
        for(int i =0;i<=50;i++) {
            if (i == 5)
                break;
                System.out.println(i);
        }
        System.out.println("Came out of loop after condition is satisfied");
    }


}
