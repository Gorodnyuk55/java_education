package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 * 01.04.2020
 * Write a program that create and display a new array from evens elements
 * of array
 *
 */

public class t_42_NewArrayEventElements {
    public static void main(String[] args) {
        int [] array = {234, 4, 5, 7, 4, 5, 3, 7, 9, 5};
        int [] newArray = new int [countArray(array)];


        int newArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                newArray[newArrayIndex] = array[i];
                System.out.print(newArray[newArrayIndex] + " ");
                newArrayIndex++;

            }
        }

    }


    public static int countArray(int [] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }

        }
        return count;
    }
}
