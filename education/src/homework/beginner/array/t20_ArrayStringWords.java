package homework.beginner.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Write program that print all elements on console from
 *the array of strings['arrays','string''programming']
 */
public class t20_ArrayStringWords {
    public static void main(String[] args) {

           System.out.println("Output 1");

            String [] arrayStringWords = {"arrays","string", "programming"};
            String NewString = "";

        for (int i = 0; i < arrayStringWords.length; i++) {
            NewString += arrayStringWords[i] + " ";
        }

        System.out.println(NewString);


        System.out.println("Output 2");

        String NewStringNew = "arrays string programming";
        String[] arrayStringWordsNew = NewStringNew.split(" ");

        for (int i = 0; i < arrayStringWordsNew.length; i++) {
            System.out.println(arrayStringWordsNew[i]);
        }

    }

}
