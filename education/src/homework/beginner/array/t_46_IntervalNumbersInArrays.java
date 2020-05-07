package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 *  Write a program that display on a console those elements of array that
 *  belongs to the interval [16, 300]
 *
 */

public class t_46_IntervalNumbersInArrays {
    public static void main(String[] args) {
        int [] mass = {2, 4, 15, 17, 45, 23, 5, 47, 543, 234, 5345, 23, 1};
        int minNumber = 16;
        int maxNumber = 300;

        for (int i : mass) {
            if (i > minNumber && i < maxNumber){
                System.out.print(i + " ");
            }
        }


    }


}
