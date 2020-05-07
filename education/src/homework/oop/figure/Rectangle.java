package homework.oop.figure;
/*
 * @author Maxim Gorodnyuk
 *
 *
 *
 */

public class Rectangle extends Figure {

    private String name;
    private double side1;
    private double side2;

    public Rectangle(String name, double side1, double side2) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double getArea() {
        return side1 * side2;
    }

    @Override
    double getPerimeter() {
        return ((side1+side2)*2);
    }

    @Override
    String getName() {
        return this.name;
    }
}
