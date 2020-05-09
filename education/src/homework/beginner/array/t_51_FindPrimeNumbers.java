package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that find in array prime numbers
 *
 */

public class t_51_FindPrimeNumbers {
    public static void main(String[] args) {
        int [] array = {5, 4, 5, 7, 3, 8, 9, 234, 17, 19, 21, 44, 55, 67, 99, 100};
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = false;
            for (int j = array[i] - 1 ; j > 1; j--) {
                if (array[i] % j == 0){
                    isPrime = true;
                    break;
                }
            }
            if (isPrime == false){
                System.out.println(array[i]);
            }

        }
    }
}
