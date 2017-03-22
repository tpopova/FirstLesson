package pack3;

import java.util.Arrays;

/**
 * Created by User_2 on 03.03.2017.
 */
public class LessonArr {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        int[] arr2 = {0, 1, 2, 3 ,4 ,5 };

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr1[4] = arr2[5];
        arr1[3] = arr2[4];

        System.out.println(Arrays.toString(arr1));

        }

      }

