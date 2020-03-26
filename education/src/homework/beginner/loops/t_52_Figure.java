package homework.beginner.loops;

public class t_52_Figure {
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


            for (int j = 4; j >= 1; j--) {

                if ((j <= i  && i <= centre2)|| (i > centre2 && j <= k2)){
                    System.out.print("*");
                }
                else System.out.print(" ");

            }
            System.out.println();
            k2--;


        }



        System.out.println("output3");
        int centre3 = 4;
        int k3 = 1;

        for (int i = 1; i <= 7; i++) {


            for (int j = 1; j <= k3; j++) {
                if (j == k3 || j == 1 )
                System.out.print("*");
                else System.out.print(" ");
            }

            if (i < centre3) {
                k3++;
            }
            else k3--;

            System.out.println();

        }



        System.out.println("output4");
        int centre4 = 4;
        int k4 = 7;
        for (int i = 1; i <= 7; i++) {


            for (int j = 4; j >= 1; j--) {

                if ((j == i  && i <= centre4)|| (i > centre4 && j == k4) || j==1){
                    System.out.print("*");
                }
                else System.out.print(" ");

            }
            System.out.println();
            k4--;


        }

    }
}
