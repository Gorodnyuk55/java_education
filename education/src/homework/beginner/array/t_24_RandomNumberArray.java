package homework.beginner.array;

//Write a program that create an array of 15 elements and assign random
//        integer numbers (use a random function)

import java.util.Arrays;

public class t_24_RandomNumberArray {
    public static void main(String[] args) {
        int[] randomNumberArray = new int [15];

        for (int i = 0, randomNumber; i < 15; i++) {
            randomNumber =  (int) ((Math.random() * 100) + 1) ;
            randomNumberArray[i] = randomNumber;
        }
        System.out.println(Arrays.toString(randomNumberArray));
    }
}
