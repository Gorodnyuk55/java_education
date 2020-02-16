package homework.beginner.array;

/**
 *
 *Write a program that create an empty array of 10 elements and assign
 * with value 5
 *
 */


public class task5 {
    public static void main(String[] args) {
        int mass[] = new int [10];
        int k = 5;

        for (int i = 0; i < 10; i++) {
            mass[i] = k;
            System.out.printf("%2d", mass[i]);
        }

    }
}
