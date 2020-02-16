package homework.beginner.loops;

import java.io.PrintStream;

/*
        Write a program that create an integer variable b and assigns value 200,
after that decrease the variable value by variable a (begin value 1) in every
loop iteration value if the variable a must be increased by 1, iteration must
be stopped when the value of the variable b will be less then 0
    */
public class task5 {
       public static void main(String[] args) {

          /* for ( int b = 200, a = 1 ; b >=1 ; b -= a, a++) {
               System.out.printf("%5d", b);
           }*/

          int b = 200;
          int a = 1;
          while (b > 0){
               b-=a;
               a++;
               System.out.printf("%5d", b);
          }

       }
}
