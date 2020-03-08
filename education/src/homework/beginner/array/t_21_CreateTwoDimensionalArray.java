package homework.beginner.array;
/*Write a program that create a two-dimensional array with size 2 x 10
        (two arrays by 10 elements), and assign values from 1 to 20*/

import java.util.Arrays;

public class t_21_CreateTwoDimensionalArray {
    public static void main(String[] args) {

        int [][] array = new int [2][10];
        int value = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = value;
                value ++;
            }
        }

        //for
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%3d", array [i][j]);
            }
            System.out.println();
        }

        //for each

        for (int[] i:array) {
            System.out.println(Arrays.toString(i));
        }


    }




}
