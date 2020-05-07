package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that display on a console how many negative numbers
 * divide by 2 without a remainder
 *
 */

public class t_45_HowNegativeNumbersInArrayDivideTwo {
    public static void main(String[] args) {
        int [] array = {-4, 5,-22,-1, 45,-99,-98,-55, 5, 43, 7, 64, 77, 107};
        int count = 0;

        for (int i : array) {
            if (i < 0 && i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}
