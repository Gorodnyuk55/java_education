package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that find the equal numbers pair in two numbers (3459
 * and 46798)
 *
 */

import homework.beginner.utils.NumberUtils;

import java.util.Arrays;

public class t_61_FindEqualNumber {
    public static void main(String[] args) {
      int number1 = 3459;
      int number2 = 46798;

      String numberOne = String.valueOf(number1);
      String numberTwo = String.valueOf(number2);

      char[] array1 = numberOne.toCharArray();
      char[] array2 = numberTwo.toCharArray();

        for (int i = 0; i <  array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }


    }
}
