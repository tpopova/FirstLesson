package pack3;

import java.util.Arrays;

/**
 * Created by User_2 on 03.03.2017.
 */
public class Lesson3 {
    int[] arrDigit = new int[10];
    int[] secondArr = {0, 1, 2, 3, 4};
    String[] popos = new String[2];
    String[] arrString = {"str1", "str2"};

    public void meth() {
        arrDigit[0] = 1;
        arrDigit[8] = 9;
    }

    public static void main(String[] args) {
        Lesson3 sc = new Lesson3();
        sc.meth();
        System.out.println(Arrays.toString(sc.arrDigit));
        System.out.println(Arrays.toString(sc.secondArr));

        for (int i = 0; i <10; i++) {
            sc.arrDigit[i] = i;
        }
        System.out.println(Arrays.toString(sc.arrDigit));

        int j = 0;
        while(j < sc.arrDigit.length){
            System.out.println(j);
            j++;
        }


        int[] am = new int[8];
        int[] bm = new int[12];
        for (int i=7; i > 0; i--){
            am [i] = i;
            System.out.println(Arrays.toString(am));

        }
    }

    }
