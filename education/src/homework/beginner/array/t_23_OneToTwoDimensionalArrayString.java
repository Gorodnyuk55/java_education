package homework.beginner.array;
/*Write a program that all elements from two-dimensional string array
        copy into one-dimensional string array*/
import java.util.Arrays;

public class t_23_OneToTwoDimensionalArrayString {
    public static void main(String[] args) {
        String [][] defaultArray = {{"Hello","world","I", "' m"}, {"a", "prorammer"}};
        int size1 = defaultArray[0].length;
        int size2 = defaultArray[1].length;

        int newArraySize = size1 + size2;

        String [] newArray = new String[newArraySize];


        for (int i = 0; i < size1; i++) {
           newArray[i] = defaultArray[0][i];
        }


        int k = 0;
        for (int j = size1; j < newArraySize; j++) {
            newArray[j] = defaultArray[1][k];
            k++;
        }
        System.out.println("Default Array " + Arrays.deepToString(defaultArray));
        System.out.println("New Array " + Arrays.toString(newArray));

    }


}
