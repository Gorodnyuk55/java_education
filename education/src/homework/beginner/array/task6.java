package homework.beginner.array;

/**
 *
 * Write a program that create an empty array of 12 elements and assign
 * with value 1
 *
 */

public class task6 {
    public static void main(String[] args) {
        int mass[] = new int [12];
        int k = 1;

        for (int i = 0; i < 12; i++) {
            mass[i] = k;
            System.out.printf("%2d", mass[i]);
        }

    }

}
