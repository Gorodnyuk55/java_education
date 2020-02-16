package homework.beginner.array;

/**
 *
 *Write a program that create an array of 5 elements with float point
 * type, assign different values and print on the console all array values
 *
 */

public class task3 {
    public static void main(String[] args) {
        double mass[] = new double[5];
        double k = 0;

        for (int i = 0; i < 5; i++) {
            mass[i] = ((int) (Math.random()*100) )/100.0;
            System.out.print("[ " + mass[i] + " ]");
        }


    }
}
