package homework.beginner.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Write program that print all elements on console from
 *the array of strings['arrays','string''programming']
 */
public class t_20_ArrayStringWords {
    public static void main(String[] args) {

           System.out.println("Output 1");

            String [] arrayStringWords = {"arrays","string", "programming"};

        for (String arrayStringWord : arrayStringWords) {
            System.out.println(arrayStringWord);
        }

            /* String newString = "";


        for (int i = 0; i < arrayStringWords.length; i++) {
            newString += arrayStringWords[i] + " ";
        }

        System.out.println(newString);*/


        System.out.println("Output 2");

        String NewStringNew = "arrays string programming";
        String[] arrayStringWordsNew = NewStringNew.split(" ");

        for (int i = 0; i < arrayStringWordsNew.length; i++) {
            System.out.println(arrayStringWordsNew[i]);
        }

    }

}
