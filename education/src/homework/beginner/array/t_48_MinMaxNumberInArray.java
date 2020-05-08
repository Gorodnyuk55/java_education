package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that find min and max element in array
 *
 */

import java.util.Arrays;

public class t_48_MinMaxNumberInArray {
    public static void main(String[] args) {
        int [] array = {3, 6, 5, 7, 34, 99, 6, 8, 32,-20, 45,-100};
        Arrays.sort(array);
        System.out.println(array[0] + " and " + array[array.length-1]);

    }
}
