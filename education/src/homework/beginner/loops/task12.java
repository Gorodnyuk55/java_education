package homework.beginner.loops;

/*Write a program that print on console values of the function y = sin 2x
        on interval [0.2; 0.4] with step 0.01*/

public class task12 {
    public static void main(String[] args) {
        double maxX = (float) 0.4;
        double minX = (float)0.2;
        double step = (float)0.01;

        for (double x = minX; x <= maxX; x += step) {
            double b = 2 * x;
            float y = (float) Math.sin(b);
           /* System.out.println("interval " +  x + " value of the function is " + y );*/
            System.out.printf("interval  %.2f value of the function is %.2f%n", x, b );

        }

    }
}
