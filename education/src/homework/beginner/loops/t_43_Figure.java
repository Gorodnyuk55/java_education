package homework.beginner.loops;

public class t_43_Figure {
    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <=3 ; j++) {
               if (j == 2 || i % 2 ==0 ) {
                   System.out.print("*");
               }
               else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
