package homework.beginner.strings;

/*Write a program that convert string into array of symbols*/

import java.util.Arrays;

public class t_5_convertStringIntoArray {
    public static void main(String[] args) {
        String defaultString = "Borrowed bread lies heavy on the stomach";
        char[] newArray = defaultString.toCharArray();
        System.out.println(Arrays.toString(newArray));
    }
}
