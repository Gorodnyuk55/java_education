package homework.beginner.loops;

public class t_48_ArrowRight {
    public static void main(String[] args) {

        System.out.println("Output 1");
        int n = 5;
        int m = 9;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((j == (i + n) && i != 1 )||i == n || i > n &&  j == m && i !=9) {
                    System.out.print("*");
                }
                else System.out.print(" ");

            }
            System.out.println();
           if (i > n){
               m--;
           }

        }

        System.out.println();
        System.out.println("Output 2");
        int center = 5;
        int g = 5;
        int k = 1;
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == center || (j == g-1 && i !=1 ) || (i > center) && j==k+1 && i !=9){
                    System.out.print("*");
                    g--;
                }
                else System.out.print(" ");
            }
            System.out.println();
           if (i > center){
               k++;
            }
        }


        System.out.println();
        System.out.println("Output 3");

        int centerH = 4;
        int leftCol = centerH;
        int rightCol = centerH;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == centerH || ((i <= centerH) && (j == leftCol || j == rightCol))){
                    System.out.print("*");
                }
                else System.out.print(" ");


                }
            System.out.println();
            leftCol--;
            rightCol++;
            }


            System.out.println();
            System.out.println("Output 4");
            int centerR = 4;
            int centerW = 6;
            int leftCol2 = 1;
            int rightCol2 = 7;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == centerR || ((i > centerW) && (j == leftCol2 || j == rightCol2))){
                    System.out.print("*");
                }
                else System.out.print(" ");


            }
            System.out.println();

            if(i > centerW) {
                leftCol2++;
                rightCol2--;
            }
        }





    }
    }

