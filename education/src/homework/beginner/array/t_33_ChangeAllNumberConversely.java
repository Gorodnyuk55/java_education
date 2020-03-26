package homework.beginner.array;

import java.util.Arrays;

public class t_33_ChangeAllNumberConversely {
    public static void main(String[] args) {
        int [] array = {5, -3, 0, 4, 4, 3, -2, 0, 4};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {


            if (array[i] < 0 ){
                array[i] = Math.abs(array[i]);
                System.out.println(array[i]);

            }
            else
            {
                array[i] = changePlusOnMinus(array[i]);
                System.out.println(array[i]);
            }
        }


       /* for (int number : array) {
            if (number < 0 ){
                number = Math.abs(number);
                System.out.println(number);
            }
            else
            {
                number = changePlusOnMinus(number);
                System.out.println(number);
            }

        }*/

        System.out.println(Arrays.toString(array));


    }

    public static int changePlusOnMinus(int number){
        number = number-2*number;
        return number;
    }
}
