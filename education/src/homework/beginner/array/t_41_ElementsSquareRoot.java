package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 * 01.04.2020
 * Write a program that find all numbers from 101 to 999 whose square
 * root is integer without remainder
 *
 */

public class t_41_ElementsSquareRoot {
    public static void main(String[] args) {
        int minNumber = 101;
        int maxNumber = 999;
        int [] array = new int [maxNumber-minNumber + 1];

        for (int i = 0, k = minNumber; i < array.length; i++, k++) {
            if(  Math.sqrt(k) % 1 == 0) {
                System.out.print(k + " ");
            }
        }


        /*
        for (int i = 0; i < array.length; i++) {
            if(array[i] % (int) Math.sqrt(array[i]) == 0) {
                System.out.println(array[i]);
            }
        }*/




    }


}
