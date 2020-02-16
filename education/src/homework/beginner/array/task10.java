package homework.beginner.array;

/**
 *
 *Write a program that create an array of 25 elements, and assign with
 * values from 106 to 130
 *
 *
 */

public class task10 {
    public static void main(String[] args) {
        int mass[] = new int[25];
        int k=106;
        for (int i = 0; i < 25; i++) {
            mass[i] = k;
            k++;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println(mass[0]);
    }
}
