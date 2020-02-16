package homework.beginner.basic;

 /* task26
    Write a program that calculate*/


public class task37 {
    public static void main(String[] args) {
        double a = 6.3;
        double b = 1.7;
        double sum = a + b;

        double result = (Math.sqrt( a * b) * ((a / b) - (b / a))) /
                         (Math.sqrt(Math.pow(sum, 2) - 4 * a *b));

        System.out.println(result);

    }
}
