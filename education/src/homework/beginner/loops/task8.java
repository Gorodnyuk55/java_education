package homework.beginner.loops;
/*
    Write a program that print all natural numbers from 1 to 100
 */
public class task8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 1){
                System.out.printf("%n");
            }
            System.out.printf("%4d", i );

        }
    }
}
