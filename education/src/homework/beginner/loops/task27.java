package homework.beginner.loops;
/*
 *Write a program that display on console a figure
 */

public class task27 {
    public static void main(String[] args) {

        System.out.println("Output 1");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }

        System.out.printf("\n");

        System.out.println("Output 2");
        for (int j = 9; j >= 1; j--) {
            System.out.print(j + " ");
        }

        System.out.printf("\n");

        System.out.println("Output 3");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j==i) {
                    System.out.print(j+" ");
                }
                else System.out.print("  ");
                }
            System.out.println();
        }

        System.out.printf("\n");
        System.out.println("Output 4");
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= 1; j--) {
                if (i == j ) {
                    System.out.print(i);
                }
                else System.out.print(" ");
            }
            System.out.println();
        }





        System.out.printf("\n");

        System.out.println("Output 5");
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= 1; j--) {
                if (j==i) {
                    System.out.print(j + " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }


        System.out.println("Output 4");
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= 1; j--) {
               if (i == j ) {
                   System.out.print(i);
               }
               else System.out.print(" ");
            }
            System.out.println();
        }


        System.out.printf("\n");

        System.out.println("Output 6");
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j < 10; j++) {
                if (i == j ) {
                    System.out.print(i);
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.printf("\n");

        System.out.println("Output 7");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {

                if (i == j || i + j == 10) {
                    System.out.print( i );

                } else System.out.print(" ");
            }
                 System.out.println();
            }

        System.out.printf("\n");
        System.out.println("Output 7");
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= 1; j--) {
            if (i == j || i + j == 10){
                System.out.print(i);}
            else System.out.print(" ");
            }
            System.out.println();
        }
















    }
}