package homework.beginner.array;

//Write a program that all elements from two-dimensional array copy
//into one-dimensional array

import java.util.Arrays;
import java.util.stream.Stream;

public class t_22_OneToTwoDimensionalArray {
    public static void main(String[] args) {
        int [][] defaultArray = {{4, 6, 8, 6, 4, 3, 6, 33, 6, 4, 2}, {5, 8, 7}};

        int newArraySize = 0;
        for (int[] array : defaultArray) {
          newArraySize += array.length;
        }

        int[] newArray = new int [newArraySize];
        int count = 0;
        for (int i = 0; i < defaultArray.length; i++) {
            for (int j = 0; j < defaultArray[i].length; j++) {
                newArray[count] = defaultArray[i][j];
                count++;
            }

        }

        System.out.println("Default Array " + Arrays.deepToString(defaultArray));
        System.out.println("New Array " + Arrays.toString(newArray));

    }


}
