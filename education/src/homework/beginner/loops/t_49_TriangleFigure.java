package homework.beginner.loops;

public class t_49_TriangleFigure {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Output 1");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Output 2");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1 ; j--) {
                if (j <= i){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println("Output 3");

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1 ; j--) {
                if (j <= i){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }




        System.out.println();
        System.out.println("Output 4");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println("Output 5");
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8 ; j++) {
                if (( j == 1) || (j == i) || i == 8){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Output 6");
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                if (( j == 1) || (j == i) || i == 8){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Output 7");
        for (int i = 8; i >= 1; i--) {
            for (int j = 8; j >= 1 ; j--) {
                if (( j == 1) || (j == i) || i == 8){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println("Output 8");
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= 1 ; j--) {
                if (( j == 1) || (j == i) || i == 8){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }









    }
}
