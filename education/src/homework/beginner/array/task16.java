package homework.beginner.array;
/*Write a program that copy all evens elements into new array*/
import java.util.Arrays;


public class task16 {
    public static void main(String[] args) {
        int[] mass1 = {5, 7, 4, 4, 3, 2, 78, 45, 4, 3, 22, 100, 0, 12};


        //нужно узнать сколько ячеек будет в новом массиве
        int count = 0;
        for (int countOldMass : mass1
        ) {
            if (countOldMass % 2 == 0 && countOldMass != 0) {
                count++;
            }

        }


        int[] mass2 = new int[count];
        int k = 0; // нулевой элемент нового массива

        for (int countOldMass : mass1
        ) {
            if (countOldMass % 2 == 0 && countOldMass != 0) {
                mass2[k] = countOldMass;
                k++;
            }
        }

        System.out.println("Old arrays - " + Arrays.toString(mass1));
        System.out.println("New arrays - " + Arrays.toString(mass2));


    }
}
