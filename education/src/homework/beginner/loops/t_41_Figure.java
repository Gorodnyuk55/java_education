package homework.beginner.loops;

import java.io.PrintStream;

public class t_41_Figure {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("output 1");
        for (int i = 1; i <= 5; i++ ) {

            for (int a = 5; a > i; a--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 5; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\n");
        System.out.println("output 2");

        for (int i = 1; i <= 5; i++ ) {

            for (int a = 5; a > i; a--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 5; k++) {
                if (k == 1 || k == 5 || i == 1 || i == 5){
                System.out.print("* ");}
                else System.out.print("  ");
            }

            System.out.println();
        }

    }
}
