package homework.beginner.loops;
/*
Write a program that display on console (use loop)
 */
public class task11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.printf("%n");
        }
    }
}
