package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 *Write a program that determine two elements in an array of integer whose
 * sum is closest to zero
 *
 */

public class t_62_SumClosestToZero {
    public static void main(String[] args) {
        int [] array = {5, 7,-6,-3, 0, 6, 7, 23, 23, 2, 100,-101, 5, 6, 7, 3};

        int summa = 0;
        int number1 = 0;
        int number2 = 0;
        int minimalRandomNumber = 100000000;




        for  (int i = 0; i <= array.length; i++) {

            for (int j = i+1; j <= array.length-1; j++) {
                summa = Integer.valueOf(array[i]+array[j]);
            /*    System.out.print(summa + " ");*/

                if ( Math.abs(minimalRandomNumber) > Math.abs(summa)/* && summa >= 0*/){
                    {
                        minimalRandomNumber = summa;
                        number1 = i;
                        number2 = j;

                    }
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(array[number1]+ " и "+array[number2] );
    }
}
