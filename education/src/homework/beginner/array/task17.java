package homework.beginner.array;
/* Write a program that copy all odds elements into new array*/
import java.util.Arrays;


public class task17 {
    public static void main(String[] args) {
        byte[] mass1 = {7, 5, 4, 6, 12, 45, 98, -10};


        //нужно узнать сколько ячеек будет в новом массиве
        int count = 0;
        for (int countOldMass : mass1
        ) {
            if (countOldMass % 2 != 0 ) {
                count++;
            }
        }


        int[] mass2 = new int[count];
        int k = 0; // нулевой элемент нового массива

        for (int countOldMass : mass1
        ) {
            if (countOldMass % 2 != 0) {
                mass2[k] = countOldMass;
                k++;
            }
        }

        System.out.println("Old arrays - " + Arrays.toString(mass1));
        System.out.println("New arrays - " + Arrays.toString(mass2));


    }
}
