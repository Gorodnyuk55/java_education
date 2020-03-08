package homework.beginner.loops;

public class t_45_Figure {
    public static void main(String[] args) {
        int n = 1;
        int k = 1;
        for (int i = 1; i <= 21; i++ ) {
            if (i == k ) {
                for (int j = 7; j >= n; j--) {
                    System.out.print("*");
                }
                n++;
                k += n;

            }
            else System.out.print("*");

            System.out.println();

        }

        }
    }

