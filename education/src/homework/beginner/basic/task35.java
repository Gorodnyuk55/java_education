package homework.beginner.basic;

        /*task35
        Write a program that calculate area of triangle in cartesian coordinate
        system A(0,0) B (5, 6) C(0, 10)*/

public class task35 {
    public static void main(String[] args) {
        double x1 = 0;
        double y1 = 0;

        double x2 = 5;
        double y2 = 6;

        double x3 = 0;
        double y3 = 10;

        double areaOfTriangle = ((double) 1/2) * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
        System.out.println(areaOfTriangle);

    }
}
