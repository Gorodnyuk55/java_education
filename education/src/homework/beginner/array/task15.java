package homework.beginner.array;
/*write a program that all elements from the input array copy to new array */

import java.util.Arrays;

public class task15 {
    public static void main(String[] args) {
        int [] mas1 = {3, 54, 7, 3, 6, 4, 3 };
        int [] mas2 = new int [mas1.length];

        // переносим числа с начального массива в новый
        int k = 0;
        for (int number: mas1
             ) {
            mas2[k] = number;
            k++;
        }

        System.out.println("Old arrays - " + Arrays.toString(mas1));
        System.out.println("New arrays - " + Arrays.toString(mas2));

    }
}
