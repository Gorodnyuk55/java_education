package homework.beginner.basic;
   /* Write a program that calculate perimeter of rectangle with sides A (40cm)
            and B (100cm)  */

   import java.lang.Math;


public class task21 {
    public static void main(String[] args) {
        int sideA = 40;
        int sideB = 100;
        int perimetr = 2*(Math.addExact(sideA, sideB ));
        System.out.println("Perimeter of rectangle is " + perimetr);
    }
}
