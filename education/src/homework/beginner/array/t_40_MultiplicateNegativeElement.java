package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 * 01.04.2020
 * Write a program that calculate and display multiplication of all array
 * elements that have negative value
 *
 */

public class t_40_MultiplicateNegativeElement {
    public static void main(String[] args) {
        int [] array = {5,-7,-3, 5, 6, 0, 34, 2, 7, 89, 3, 4,-1, 5,-1,-2};
        int count = 1;

        for (int i : array) {
            if ( i < 0 ){
                count *=i;
            }
        }
        System.out.println(count);
    }
}
