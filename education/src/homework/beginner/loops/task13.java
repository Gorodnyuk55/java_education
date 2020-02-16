package homework.beginner.loops;

/*Write a program that print on console values of the function y
  on interval [10; 100] with step 1.5*/

public class task13 {
    public static void main(String[] args) {
        int maxX = 100;
        int minX = 10;
        double step = 1.5;

        for (double x = minX; x <= maxX; x += step) {
             double y = (2-x)/(Math.sqrt(x) + x - 6);
             System.out.printf("interval  %.1f value of the function is %.5f%n", x, y );
        }

    }
}
