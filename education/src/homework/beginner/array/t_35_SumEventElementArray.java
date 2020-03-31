package homework.beginner.array;
/*
 *
 *@Maxim
 *Write a program that calculate and display sum of every second element
 * in an array
 */

public class t_35_SumEventElementArray {
    public static void main(String[] args) {
        int[]array = {5, 4, 7, 8, 45, 123, 4, 78, 5, 6, 7, 8, 9, 0, 23, 4, 34};
        int count = 0;
        for (int i = 1; i < array.length ; i += 2) {
            count += array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println("sum = " + count);
    }
}
