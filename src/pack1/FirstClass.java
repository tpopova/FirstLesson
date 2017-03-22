package pack1;

/**
 * Created by User_2 on 23.02.2017.
 */
public class FirstClass {
    int intDigit1 = 1;
    double name = 65.88;
    boolean popo = true;
    String strDigit = "2";
    char c = 's';

    public static String nameofMethod(){
    int secondDigit = 5;
    return "method"+secondDigit;
    }

    public static void main(String[] args) {
        String hello = "Hello";
        String world = "world!";

        int digit1 = 5;
        int digit2 = 6;

        String sum = hello + world;

        if((digit1+digit2) > 11){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println((digit1 * digit2)/3);


    }

}
