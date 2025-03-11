package My_Java_Programs_BSharma;

public class Class1_Datatypes {
    public static void main(String[] args) {
        //byte
        byte a = 127;
        byte b = -128;
        /*Invalid byte
        byte range = 200;
        byte s = "Invalid";
        byte f = 1.1f;
        byte d = 1.11;*/

        //short
        short c = 32767;
        short d = -32768;
        /*Invalid short
        short range = 50000;
        short s = "Invalid";
        short f = 1.1f;
        short d = 1.11;*/

        //int
        int e = 2147483647;
        int f = -2147483648;
        /*Invalid int
        int range = 2147483649;
        int s = "Invalid";
        int f = 1.1f;
        int d = 1.11;*/

        //long
        long g = 9223372036854775807L;
        long h = -9223372036854775808L;
        /*Invalid long
        long range = 9223372036854775809L;
        long s = "Invalid";
        long f = 1.1f;
        long d = 1.11;*/

        //boolean
        boolean i = true;
        boolean j = false;
        /*Invalid boolean
        boolean range = true/false;
        boolean s = "true"; - becomes a string NO ""
        boolean f = "false"; - becomes a string NO ""
        boolean f = 1.1f;
        boolean d = 1.11;*/

        //Float
        float k = 3.4028235e38F;
        float l = -3.4028235e37F;
        /*Invalid float
        float range = 3.4028235e39F;
        float s = "true";
        float f = 1f;
        float d = 100.200 - considered as double, f missing.
        float d = 1.111111111111111; - Out of range */

        //Double
//      double m = 3.4e308; e power 308.
//      double n = -3.4e308;
//      double can take upto 14 digits after decimal.
        /*Invalid double
        double range = 3.4e310;
        double s = "true";
        double f = 1d;*/

        /*Datatype rules
        byte < short < int < long < float < double
        byte value can be assigned to double but viceversa is not possible.
         */


    }
}
