package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that check if an array contains the value 5
 *
 */

public class t_52_CheckNumberInArray {

    public static void checkNumberInArray(int number, int [] array){
        boolean containsNumberInArray = false;
        for (int i : array) {
            if (i == number){
                containsNumberInArray = true;
                break;
            }
        }
        if (containsNumberInArray == true) {
            System.out.println("Array contains " + number);
        }
        else  System.out.println("Array not contains " + number);
    }

    public static void main(String[] args) {
        int [] array1 = {6,4,3,9,10,12,-45};
        int [] array2 = {7, 4, 5, 0,-39, 23};
        int number = 5;

        checkNumberInArray(number,array1);
        checkNumberInArray(number,array2);

    }
}
