package homework.beginner.array;

import java.util.Arrays;
    /*Write a program that create an array with random size and assign all
            elements by -1*/
public class t_25_ArrayRandomSize {
    public static void main(String[] args) {
        int randomSize = (int) ((Math.random() * 10) + 1);
        System.out.println("Random size" + randomSize);
        int[] arrayRandomSize = new int [randomSize];

        for (int i = 0; i < randomSize; i++) {
            arrayRandomSize[i] = -1;
        }
        System.out.println(Arrays.toString(arrayRandomSize));
    }
}
