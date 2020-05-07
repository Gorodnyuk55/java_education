package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that sort array in ascending way
 *
 */

import java.util.Arrays;

public class t_43_AscendingSortArray {
    public static void main(String[] args) {
        int [] arrayDefault = {5, 4, 6, 8, 3, 23, 5, 67, 45, 4, 24, 6, 34};

       // first method

       Arrays.sort(arrayDefault);

        int [] arrayNew = new int [arrayDefault.length];

        for (int i = 0; i < arrayDefault.length; i++) {
            System.out.print(" " + arrayDefault[i]);
        }

        System.out.println();
        // second method  (selection)
       int [] arrayDefault2 = {5, 4, 6, 8, 3, 23, 5, 67, 45, 4, 24, 6, 34};

        for (int i = 0; i < arrayDefault2.length; i++) {
               int min = arrayDefault2[i];
               int minNumber = i;

            for (int j = i + 1; j < arrayDefault2.length; j++) {
                if (arrayDefault2[j] < min) {
                    min = arrayDefault2[j];
                    minNumber = j;
                }
            }
            if (i != minNumber){
                int additionalVariable = arrayDefault2[i];
                arrayDefault2[i] = arrayDefault2[minNumber];
                arrayDefault2[minNumber] = additionalVariable;
            }


            System.out.print(" " + arrayDefault2[i]);
        }

    }
}
