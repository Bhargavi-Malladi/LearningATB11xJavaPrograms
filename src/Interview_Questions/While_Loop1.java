package Interview_Questions;

public class While_Loop1 {
    public static void main(String[] args) {
        int i1=10;
        while(i1<=10) //true
        {
            System.out.println(i1);
            --i1;
        }
        int i =0;
        while(i<0) //false
        {
            System.out.println(i);
            i++;
        }
    }
}
