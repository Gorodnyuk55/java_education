package homework.beginner.strings;

import java.util.Random;

/*Write a program that generate 1 000 000 strings (put them into an
        array), every string must randomly generated (from 10 to 1000 randomly
        symbols). Than a program must count symbols in all*/
public class t_2_MillionString {
    public static void main(String[] args) {

        String[] millionString = new String [10];
        int count = 0;
        String symbol = "a";

        for (int i = 0; i < millionString.length; i++) {
            int randomNumber = (int)(Math.random() * ((1000-10)+1) - 10);
               System.out.println(randomNumber);

            for (int j = 0; j < randomNumber; j++) {

                millionString[i] = symbol;
             System.out.print(millionString[i]);
                count += symbol.length();
            }
            System.out.println();

        }

        System.out.println(count);
    }
}
