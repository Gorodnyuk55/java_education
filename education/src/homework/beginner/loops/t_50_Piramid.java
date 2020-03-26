package homework.beginner.loops;

public class t_50_Piramid {
    public static void main(String[] args) {

        System.out.println("output 1");
        int center = 4;
        int left = center;
        int right = center;


        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 7; j++) {
                if ((j == left)|| (j == right) || i == 4) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            left--;
            right++;

            System.out.println();
        }

        System.out.println("output 2");
        int left2 = 7;
        int right2 = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((j == left2) || (j == right2) || i == 1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            left2--;
            right2++;

            System.out.println();
        }

        System.out.println("output 3");
        int left3 = 4;
        int right3 = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((j >= left3) && (j <= right3)) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            left3--;
            right3++;

            System.out.println();
        }



        System.out.println("output 4");
        int left4 = 7;
        int right4 = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((j <= left4) && (j >= right4) || i == 1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            left4--;
            right4++;

            System.out.println();
        }

    }
}
