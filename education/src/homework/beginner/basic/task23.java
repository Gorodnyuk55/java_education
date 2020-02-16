package homework.beginner.basic;
/* task23
   Write a program that display on console result of 3(10)
 */

import java.lang.Math;

public class task23 {

    public static void main(String[] args) {
        int number = 3;
        int degree = 10;
        int numberInDegree = (int) Math.pow(number, degree);
        System.out.println(numberInDegree);

    }
}
