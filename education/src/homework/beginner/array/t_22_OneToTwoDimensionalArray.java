package homework.beginner.array;

//Write a program that all elements from two-dimensional array copy
//into one-dimensional array

import java.util.Arrays;

public class t_22_OneToTwoDimensionalArray {
    public static void main(String[] args) {
        int [][] defaultArray = {{4, 6, 8, 6, 4, 3, 6, 33, 6, 4, 2}, {5, 8, 7}};
        int size1 = defaultArray[0].length;
        int size2 = defaultArray[1].length;

        int newArraySize = size1 + size2;

        int[] newArray = new int [newArraySize];


        for (int i = 0; i < size1; i++) {
           newArray[i] = defaultArray[0][i];
        }


       int k = 0;
       for (int j = size1; j < newArraySize; j++) {
            newArray[j] = defaultArray[1][k];
            k++;
        }
        System.out.println("Default Array " + Arrays.deepToString(defaultArray));
        System.out.println("New Array " + Arrays.toString(newArray));

    }


}
