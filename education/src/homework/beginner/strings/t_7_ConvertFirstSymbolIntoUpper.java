package homework.beginner.strings;

import java.util.Arrays;
import java.util.Objects;

//write a program that convert first symbol in string to upper case for every word
public class t_7_ConvertFirstSymbolIntoUpper {
        public static void main(String[] args) {

            String defaultString = "Fire begins with sparks";
            System.out.println(defaultString);


            String[] array = new String[defaultString.length()];
            String spaceVariable = " ";

            for (int i = 0; i < array.length; i++) {
                array[i] = String.valueOf(defaultString.charAt(i));
            }


            for (int i = 0; i < array.length; i++) {
               if (array[i].equals(spaceVariable)){
                array[i+1] = array[i+1].toUpperCase();}
            }
            System.out.println(Arrays.toString(array));


            StringBuilder newString = new StringBuilder();
            for(int i = 0; i < array.length; i++) {
                newString.append(array[i]);
            }
            System.out.println(newString);



        }

}
