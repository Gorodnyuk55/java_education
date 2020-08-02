package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that check if in the input array presents values 10 and
 * 11, if those values are present print on console true, if not print false
 *
 */

public class t_60_CheckTwoNumber {

    public static void main(String[] args) {
        int [] array1 = {4, 2356, 4, 32, 6, 578, 34, 7, 35, 547, 345, 6, 24, 10, 523, 5, 324};
        int [] array2 = {234, 54, 23, 411, 33, 11, 3, 21, 5, 57, 45, 7, 10, 3, 234, 5, 53, 45};

        int firstNumber = 10;
        int secondNumber = 11;


        System.out.println(checkTwoNumber(firstNumber, secondNumber, array1));
        System.out.println(checkTwoNumber(firstNumber, secondNumber, array2));
    }

    public static boolean checkTwoNumber (int searcheNumber1, int searcheNumber2, int [] mass){
        int checkingTwoNumber = searcheNumber1 + searcheNumber2;
        for (int i = 0; i < mass.length ; i++) {
            if (searcheNumber1 == mass[i] || searcheNumber2 == mass[i]){
                checkingTwoNumber -= mass[i];
            }
    }
        if (checkingTwoNumber == 0){
            return true;
        }
        else return false;
    }

}
