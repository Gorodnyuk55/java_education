package homework.beginner.loops;
/*Write a program that print numbers in diferent ways*/
public class task33 {
    public static void main(String[] args) {


        System.out.println("Output 1");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
            
        }

        System.out.printf("\n");
        System.out.println("Output 2");
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }


        System.out.println("Output 3");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

        System.out.printf("\n");
        System.out.println("Output 4");
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

        System.out.printf("\n");
        System.out.println("Output 5");
        int x = 0;
        for (int i = 1; i <= 8; i++) {
            x += i;

            for (int j = 1; j <= i; j++) {
                System.out.print(x +" ");
            }
            System.out.println();

        }







    }
}
