package homework.beginner.array;
// Write a program that revers elements in an array
import java.util.Arrays;

public class t_29_ReverseArray {
    public static void main(String[] args) {
        int [] mass = {1,2,3,4,5,6,-1};
        int [] newMass = new int [mass.length];

        for (int i = mass.length-1; i >= 0 ; i--) {
            newMass[i] = mass[i];
            System.out.print(newMass[i] + " ");
        }


    }

}
