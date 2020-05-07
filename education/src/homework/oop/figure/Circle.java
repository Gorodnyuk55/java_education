package homework.oop.figure;
/*
 * @author Maxim Gorodnyuk
 *
 *
 *
 */

public class Circle extends Figure {
    private double r;
    private String name;

    public Circle(String name, double r) {
        this.r = r;
        this.name = name;
    }

    @Override
    double getArea() {
        return r*r*PI;
    }

    @Override
    double getPerimeter() {
        return 2*PI*r;
    }

    @Override
    String getName() {
        return name;
    }
}
