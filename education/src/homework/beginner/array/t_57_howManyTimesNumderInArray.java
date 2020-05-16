package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that check how many times number
 *  7 presents in an array
 *
 */

public class t_57_howManyTimesNumderInArray {
    public static void main(String[] args) {
        int [] array = {4, 23, 7, 7, 17, 23, 77, 3243, 34, 23, 5, 777, 324, 12, 167, 234, 43};
        System.out.println(countNumbersInArray(7,array));
    }

    public static int countNumbersInArray(int searchNumber, int[] array){
        int count = 0;
        for (int i : array) {
            if (i == searchNumber){
                count++;
            }
        }
        return count;
    }
}
