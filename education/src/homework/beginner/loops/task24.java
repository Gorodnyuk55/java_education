package homework.beginner.loops;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class task24 {
    public static void main(String[] args) {
        System.out.println("Output 1");
        int number = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("Output 2");

        int zero = 0;
        int one = 1;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i % 2 == 0)  System.out.print(zero + " ");
                else {
                    System.out.print(one + " ");
                }
                }
            System.out.println();
            }


            System.out.println("Output 3");

            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 6; j++) {
                     if (j % 2 == 0) {
                        System.out.print(one + " ");
                    } else {
                        System.out.print(zero + " ");
                    }

                }
                System.out.println();
            }



    }
}
