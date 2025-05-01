package ex_01_Java_Basic;

public class Lab_039_Arrays {
    public static void main(String[] args) {
        //Arrays Creation
        String names[] = new String[3];
        names[0]="Blue1";
        names[1]="Blue2";
        names[2]="Blue3";
        //or
        String[] names1 = new String[3];
        names1[0]="Blah";
        names1[1]="Blah2";
        names1[2]="Blah3";
        //or -- set of marks with int as below,
        int[] marks = {1,2,3};
        System.out.println(marks.length);
        System.out.println(names[0]);
        System.out.println(names1[2]);
        //System.out.println(names[5]); ArrayIndexOutOfBound
        //or
        boolean[] isAgeGreaterThan18 = new boolean[2];
        isAgeGreaterThan18[0] = true;
        isAgeGreaterThan18[1] = false;

    }

}
