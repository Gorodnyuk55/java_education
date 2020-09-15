package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that find two elements in a sorted array whose sum is 8
 *
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class t_63_SumIsNumber {
    public static void main(String[] args ) {

        int[] array = {1, 3, 4, 4, 5, 1};
        int firstNumberInArray = 0;
        int secondNumberInArray = 0;
        int summa = 8;
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        HasNumberInArray(array, summa, firstNumberInArray, secondNumberInArray);
    }


    public static boolean HasNumberInArray(int array[], int summa, int firstNumberInArray, int secondNumberInArray) {

        int numberLeftIndex = 0;
        int numberRightIndex = array.length - 1;

        while (array[numberRightIndex] > array[numberLeftIndex]) {


            if (array[numberLeftIndex] + array[numberRightIndex] == summa) {
                System.out.println("we have two elements the amount which is equal " + summa
                        + ": " +array[numberLeftIndex]  + " and " + array[numberRightIndex]);
                return true;

            } else if (array[numberLeftIndex] + array[numberRightIndex] < summa) {
                numberLeftIndex++;
            } else if (array[numberLeftIndex] + array[numberRightIndex] > summa) {
                numberRightIndex--;
            }

        }


        return false;
    }
}