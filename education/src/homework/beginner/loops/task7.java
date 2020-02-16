package homework.beginner.loops;
/*
Write a program that create an integer variable d with value 1 and multiply 10 times by 3
 */
public class task7 {
    public static void main(String[] args) {
        int d = 1;
        int multiply = 10;
        int timeBy = 3;

        for (int i = 0; i < multiply; i++) {
            d *= timeBy;
            System.out.printf("%7d", d);
        }

        System.out.printf("%n");

        int result = d;
        System.out.println("Result - " + result);

    }
}
