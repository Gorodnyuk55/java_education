package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that check if an array contains unique element
 *
 */

import java.util.Arrays;

import static java.util.Arrays.*;

public class t_58_uniqueElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 3, 1, 5, 10, 4};
        Arrays.sort(array);

        int uniqueElement = 320000;
        for (int firstElement = 0, secondElement = 1; secondElement < array.length;
             firstElement++, secondElement++) {
            if (array[secondElement] == array[firstElement]) {

                uniqueElement = array[firstElement];
                System.out.print(uniqueElement + " ");
            }
        }

        if (uniqueElement == 320000){
            System.out.println("no unique elements");
        }

    }

}
