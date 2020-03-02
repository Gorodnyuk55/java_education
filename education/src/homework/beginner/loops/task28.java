package homework.beginner.loops;
/*
 *Write a program that display a figure
 */
public class task28 {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i == j || i + j == 12 || j == 1 || j ==11 || i == 1 || i == 11 ) {
                    System.out.print(" * ");
                }
                else  System.out.print("   ");
            }

            System.out.printf("\n");
            System.out.println();

            }






    }
}
