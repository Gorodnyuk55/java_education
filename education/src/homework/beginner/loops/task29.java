package homework.beginner.loops;
/*
 *Write a program that display a figure on console
 */
public class task29 {
    public static void main(String[] args) {

        System.out.printf("\n");
        System.out.println("Output 1");

        int k = 3;
        int z = 0;
        for (int i = 1; i <=7 ; i++) {

            for (int j = 1; j <=8 ; j++) {
                if (j > z && j < k) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
            k++;
            z++;
        }


        System.out.printf("\n");
        System.out.println("Output 2");

        int w = 8;
        int e = 7;
        for (int i = 7; i >=1 ; i--) {

            for (int j = 1; j <=8 ; j++) {
               if (j >= e && j <= w){
                   System.out.print("*");
               }
               else System.out.print(" ");
            }
            System.out.println();
            w--;
            e--;
        }


    }
}
