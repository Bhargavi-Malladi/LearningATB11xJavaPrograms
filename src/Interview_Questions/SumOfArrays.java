package Interview_Questions;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] numbers = {12,34,67,48};
        int sum=0;
        for(int i =0;i< numbers.length;i++)
        {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}