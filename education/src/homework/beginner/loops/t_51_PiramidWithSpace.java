package homework.beginner.loops;

public class t_51_PiramidWithSpace {
    public static void main(String[] args) {
        System.out.println("output1");

        int left3 = 4;
        int right3 = 4;
        for (int i = 0; i < 7; i++) {
            if (i % 2  == 1) {
                System.out.println();
                continue;
            }
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


        System.out.println("output2");

        int left4 = 7;
        int right4 = 1;
        for (int i = 0; i < 7; i++) {
            if (i % 2  == 1) {
                System.out.println();
                continue;
            }
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

        System.out.println("output3");





    }
}
