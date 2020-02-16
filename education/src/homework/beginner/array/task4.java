package homework.beginner.array;

/**
 *Write a program that create an array of integer elements type with
 * length 5 and assign all elements with different values, after that display
 * all elements of the array on console
 */

public class task4 {
    public static void main(String[] args) {
        int mass[] = new int[5];


        for (int i = 0; i < 5; i++) {
            mass[i] = (int) (Math.random() * 100);
            System.out.print("[ " + mass[i] + " ]");

        }

        System.out.println();
        System.out.println(mass[3]);
    }
}
