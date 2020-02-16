package homework.beginner.loops;
        /*task1
        Write a program that display on console 5 stars in two ways*/

public class task1 {
    public static void main(String[] args) {

        System.out.println("Output 1");
        int i = 0;
        while (i < 5) {
            System.out.println("*");
            i++;
        }

        System.out.println("Output 2");

        for(int x = 0; x< 5;x++) {
        System.out.print("*");
        }

    }
}


