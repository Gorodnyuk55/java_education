package homework.oop.figure;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that create hierarchy of geometric figures. For different
 * classes will be different constructors.
 *
 */

 abstract class Figure {
     final  double PI = 3.14;

     abstract double getArea();
     abstract double getPerimeter();
     abstract String getName();
}
