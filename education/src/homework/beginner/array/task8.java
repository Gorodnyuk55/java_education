package homework.beginner.array;

/**
 *
 *Write a program that create an empty array of 6 elements and assign first
 * half of array with value 3 and second half 4
 *
 */
public class task8 {
    public static void main(String[] args) {
        int mass[] = new int[6];
        int firstHalf = mass.length / 2;

        int k=3;

        for (int i = 0; i < 6; i++) {
            mass[i] = k;

            if (i >= firstHalf){
                mass[i] = 4;
            }

            System.out.printf("%4d", mass[i]);
        }

    }
}
