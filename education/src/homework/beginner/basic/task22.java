package homework.beginner.basic;

   /* task22
   Write a program that calculate area of rectangle with sides A (5cm) and
            B (500cm)  */

import java.lang.Math;


public class task22 {
    public static void main(String[] args) {
        int sidesA = 5;
        int sidesB = 500;
        int perimetr = Math.multiplyExact(sidesA, sidesB);
        System.out.println("Perimeter of rectangle is " + perimetr +" cm2");
    }
}