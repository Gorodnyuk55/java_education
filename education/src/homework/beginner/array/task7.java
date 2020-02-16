package homework.beginner.array;

/**
 *Write a program that create an array of 8 elements and assign with value
 * 0, after that assign every even element of the array by value 101, display
 * all elements on console
 *
 */

public class task7 {
    public static void main(String[] args) {
        int mass[] = new int [8];
        int k = 0;
        int newValue = 101;

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0 && i != 0){
                mass[i] = newValue;
            }
             else {
                mass[i] = k;
            }

            System.out.printf("%4d", mass[i]);
        }

    }


}
