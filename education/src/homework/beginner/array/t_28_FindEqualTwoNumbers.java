package homework.beginner.array;
// write a program that find the equal numbers pair in two numbers 3459 and 46798

import homework.beginner.utils.NumberUtils;

import java.util.Arrays;

public class t_28_FindEqualTwoNumbers {
    public static void main(String[] args) {
        int numberOne = 3459;
        int numberTwo = 5467985;

        int[] NumberArrayOne = NumberUtils.numberParser(numberOne);
        int[] NumberArrayTwo = NumberUtils.numberParser(numberTwo);


        for (int m = 0; m < NumberArrayOne.length; m++) {
            int serchEqualNumber = NumberArrayOne[m];

            for (int k = 0; k < NumberArrayTwo.length; k++) {
                    if (serchEqualNumber == NumberArrayTwo[k]) {
                        System.out.print(" " + serchEqualNumber);
                        break;
                    }
                }
            }

        }


    }






