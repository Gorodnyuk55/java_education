package homework.beginner.loops;
/*
 *Write a program that display all numbers from 1 to 28 in triangle way
 *(every line contains one more numbers than previous, first line is starting
 *from 1)
 */

public class task34 {

    public static void main(String[] args) {
        int z = 0;
        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j < i; j++) {
                z++;

                System.out.print(z + " ");
                
            }
            
            System.out.println();
        }

        System.out.println("\n");

        int x = 0;
        for (int i = 1; i <= 7; i++) {

            for (int j = 8; j >= 1; j--) {

                if (i >= j){
                    x++;
                    System.out.printf( "%3d", x);
                }
                else System.out.print("   ");
            }

            System.out.println();
        }

    }
}
