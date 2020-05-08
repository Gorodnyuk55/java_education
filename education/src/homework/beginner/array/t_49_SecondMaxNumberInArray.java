package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that find the second max value of the array
 *
 */

import java.util.Arrays;

public class t_49_SecondMaxNumberInArray {
    public static void main(String[] args) {
        int [] array = {6, 34, 654, 76, 6723, 4, 5, 4, 43, 42, 6, 67, 2, 4};
        Arrays.sort(array);
        System.out.println(array[array.length-2]);

    }
}
