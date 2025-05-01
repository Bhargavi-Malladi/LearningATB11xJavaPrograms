package Interview_Questions;

public class Max_Min_InArray {
    public static void main(String[] args) {
        int array[] = {82, 14, 57, 39, 91, 63, 28, 74, 119, 11, 37, 65, 48, 23, 99};
        int max_output = give_me_max(array);
        System.out.println(max_output);
    }

    private static int give_me_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}