package homework.oop.figure;
/*
 * @author Maxim Gorodnyuk
 *
 *
 *
 */

public class Demo {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle("Rectangle", 20, 10);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle("Circle", 10);
        System.out.println(circle.getName());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }



}