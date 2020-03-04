package homework.beginner.array;

/*Write a program that copy all elements
        into two-dimensional array in specific way*/

import java.util.Arrays;

public class task18 {
    public static void main(String[] args) {
        int[] mass1 = {6, 12, 65, -5};
        System.out.println("Old arrays - " + Arrays.toString(mass1));
        //how many elements in the second colum new array
        int count = mass1.length;
        /* create new array */

        int [][] mass2= new int[1][count];
       int k = -1;

       //put elements from the mass1 array into mass2

      for (int counter:mass1
             ) {
            k++;
            mass2[0][k] = counter;

          /*System.out.println(mass2[0][k]);*/
        }

      /* mass2[0][0] = 6;
       mass2[0][1] = 12;
       mass2[0][2] = 65;
       mass2[0][3] = -5;*/

        System.out.println("New arrays - " + Arrays.deepToString(mass2));



    }
}
