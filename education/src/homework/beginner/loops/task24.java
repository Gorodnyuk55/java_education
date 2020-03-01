package homework.beginner.loops;

/*
 * Write a program that display on console
 */


public class task24 {
    public static void main(String[] args) {

        final int ZERO = 0;
        final int ONE = 1;
        final int SIX = 6;


        System.out.println("Output 1");
        int number = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("Output 2");


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i % 2 == 0) System.out.print(ZERO + " ");
                else {
                    System.out.print(ONE + " ");
                }
            }
            System.out.println();
        }


        System.out.println("Output 3");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j % 2 == 0) {
                    System.out.print(ONE + " ");
                } else {
                    System.out.print(ZERO + " ");
                }

            }
            System.out.println();
        }


        System.out.println("Output 4");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == 1 || j == 6 || i == 1 || i == 6) System.out.print(ZERO + " ");
                else System.out.print(ONE + " ");
            }
            System.out.println();
        }


        System.out.println("Output 5");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == 2 || j == 5 ) System.out.print(ZERO + " ");
                else System.out.print(ONE + " ");
            }
            System.out.println();
        }

        System.out.println("Output 6");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == 3 || j == 4 || i == 3 || i == 4) System.out.print(ZERO + " ");
                else System.out.print(ONE + " ");
            }
            System.out.println();
        }

        System.out.println("Output 7");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if ( j <= 4 && j >= 3 && i <= 4 && i >= 3  ) System.out.print(ZERO + " ");
                else System.out.print(ONE + " ");
            }
            System.out.println();
        }





        System.out.println("Output 8");

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                int k = j;
                k += i;

                System.out.print(k + " ");

            }
            System.out.println();
        }


        System.out.println("Output 9");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= 6 - i) System.out.print(j + " ");
                else System.out.print(SIX + " ");
            }
            System.out.println();
        }











    }
}
