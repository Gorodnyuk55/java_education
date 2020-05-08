package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that find the second min value of the array
 *
 */

import java.util.Arrays;

public class t_50_SecondMinNumberArray {
    public static void main(String[] args) {
        int [] array = {5, 7, 5, 0, 6, 4,-6,-4, 5};
        Arrays.sort(array);
        System.out.println(array[0]);

    }
}
