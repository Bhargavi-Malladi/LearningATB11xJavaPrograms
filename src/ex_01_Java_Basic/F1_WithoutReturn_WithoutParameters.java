package ex_01_Java_Basic;

public class F1_WithoutReturn_WithoutParameters {
        //Instance variables
        void add()
        {
            int a = 10;
            int b = 20;
            int c = a + b;
            System.out.println(c);
        }

        public static void main(String[] args) {
        //Static area
        //Create objref as we cannot call instance variables into static area directly.
        F1_WithoutReturn_WithoutParameters
                objectRef = new F1_WithoutReturn_WithoutParameters();

        objectRef.add(); // call the add() function from objectRef
        }

    }