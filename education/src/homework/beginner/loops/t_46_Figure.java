package homework.beginner.loops;

public class t_46_Figure {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            if (i % 2 == 0 ){
                for (int j = 1; j <= 29; j++) {
                    System.out.print("*");
                }

            }
            else {
                for (int j = 1; j <= 29; j++) {
                    if (j % 3 == 0 ) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
            }



        }
    }

