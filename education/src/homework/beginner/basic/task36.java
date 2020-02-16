package homework.beginner.basic;

        /*task36
        Write a program that calculate area and perimeter of a circle with radius*/

public class task36 {
    public static void main(String[] args) {
          int radius = 10;
          double area = Math.PI * Math.pow(radius, 2);
          double perimeter = 2*Math.PI * Math.pow(radius, 2);

        System.out.println("circle with radius " + radius + " have " +area + " and " + perimeter);
    }

}
