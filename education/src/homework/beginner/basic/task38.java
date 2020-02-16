package homework.beginner.basic;

   /* Write a program that find x from the quadratic equation x^2-3x+3=0
            Discriminant of the quadratic equation ...*/

public class task38 {
    public static void main(String[] args) {
        double a = 1;
        double b = -5;
        double c = 6;
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double x1;
        double x2;

        System.out.println("Discriminant is " +discriminant);

        x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("x1 is " +x1);
        System.out.println("x2 is " +x2);
    }

    }

