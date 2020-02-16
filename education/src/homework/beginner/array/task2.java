package homework.beginner.array;

/**
 *
 * Maxim Gorodnyuk
 *
 * Write a program that create an empty array of 4 elements and assign
 * index value of every elements to every elements an array
 */

public class task2 {
    public static void main(String[] args) {
        int mass[] = new int[4];
        int k = 0;

        for (int i = 0; i < 4; i++) {
           mass[i] = k;
           k++;
            System.out.printf("%2d", mass[i]);
        }


    }
}
