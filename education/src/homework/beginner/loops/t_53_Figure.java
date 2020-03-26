package homework.beginner.loops;

public class t_53_Figure {
    public static void main(String[] args) {
        System.out.println("output1");
        int centre = 4;
        int k = 1;
        for (int i = 1; i <= 7; i++) {


            for (int j = 1; j <= k; j++) {

                System.out.print("*");
            }

            if (i < centre) {
                k++;
            }
            else k--;
            System.out.println();

        }

        System.out.println("output2");
        int centre2 = 4;
        int k2 = 7;
        for (int i = 1; i <= 7; i++) {


            for (int j = 9; j >= 1; j--) {

                if ((j <= i-1  && i <= centre2)|| (i > centre2 && j <= k2)){
                    System.out.print(" ");
                }
                else System.out.print("*");

            }
            System.out.println();
            k2--;


        }
    }
}
