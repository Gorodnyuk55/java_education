package homework.beginner.array;
/*Write a program that convert all array elements into char type and print
        on the console*/


import java.util.Arrays;

public class t_26_ConvertCharType {
    public static void main(String[] args) {
        int[] defaultArray = {72, 69, 76, 76, 79};
        System.out.println("defaultArray - " + Arrays.toString(defaultArray));

        for (int i = 0; i < defaultArray.length ; i++) {

            System.out.print((char) defaultArray[i]);

        }
    }
}
