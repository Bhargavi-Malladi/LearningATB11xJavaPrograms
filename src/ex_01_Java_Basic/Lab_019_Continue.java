package ex_01_Java_Basic;

public class Lab_019_Continue {
    public static void main(String[] args) {
        for(int i = 0;i<=5;i++){
            if(i==3)
                continue;
        System.out.println(i);}
        System.out.println("Skipped 3 in the output");
    }
}
