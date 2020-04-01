package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 * 01.04.2020
 * Write a program that calculate and display sum of every second element in an array
 *
 */

import java.util.StringTokenizer;

public class t_39_SumEverySecondElement {
    public static void main(String[] args) {
        int[] array = {5, 4, 7, 8, 45, 123, 4, 78, 5, 6, 7, 8, 9, 0, 23, 4, 34};
        int sumEverySeconderyElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sumEverySeconderyElement += array[i];
            }
        }

        System.out.println(sumEverySeconderyElement);


    }

}
