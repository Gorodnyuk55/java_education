package homework.beginner.strings;
/*Write a program that convert the first and the last symbol in string to
        upper case for every word*/


import java.util.Arrays;

public class t_8_ConvertFirstAndLastSymbol {
    public static void main(String[] args) {
        String defaultString = "Drunkards know no danger";
        System.out.println(defaultString);
        String [] parseWord = defaultString.split(" ");

        for (int i = 0; i < parseWord.length; i++) {

               String[] lettersIntoWorld = parseWord[i].split("");


                for (int j = 0; j < lettersIntoWorld.length; j++) {
                       if (j == 0 || j == lettersIntoWorld.length-1){
                           lettersIntoWorld[j] = lettersIntoWorld[j].toUpperCase();
                       }

                       System.out.print(lettersIntoWorld[j] + "");
                }
                System.out.print(" ");
        }

    }

}
